package cn.com.yangshj.oauth.config;


import javax.annotation.Resource;
import javax.sql.DataSource;

import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import cn.com.yangshj.oauth.component.CustomUserDetails;
import cn.com.yangshj.oauth.component.CustomUserServiceImpl;
import cn.com.yangshj.oauth.constant.OAuthConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.core.userdetails.UserDetailsByNameServiceWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.InMemoryAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.security.rsa.crypto.KeyStoreKeyFactory;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationProvider;

/**
 * 将部分@Bean的配置提取执行单独的配置类中@Configuration
 *  * 避免造成循环依赖, WebSecurityConfig -> SmsSecurityConfig -> SmsSuccessHandler -> WebSecurityConfig
 *
 * @author yangshj
 * @since 2023/3/23 17:21
 */
@Configuration
public class TokenGranterConfig {

    @Resource
    private DataSource dataSource;
    @Resource
    private CustomUserServiceImpl customUserService;
    @Resource
    private RedisConnectionFactory redisConnectionFactory;


    @Bean
    public AuthorizationCodeServices authorizationCodeServices() {
        return new InMemoryAuthorizationCodeServices();
    }

    /**
     * 自定义实现 TokenService，配置自定义实现的：
     *      Token存储
     *      客户端信息管理方式（JDBC方式）
     *      Token增强链
     *      自定义用户查询
     */
    @Bean
    @Primary
    public AuthorizationServerTokenServices tokenServices() {
        // 配置Token增强链，将自定义的 tokenEnhancer 增强器和 JWT 转换工具放入
        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(tokenEnhancer(), jwtAccessTokenConverter()));
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        // 替换自定义的 TokenStore 存储方式，使用 Redis 存储
        tokenServices.setTokenStore(redisTokenStore());
        tokenServices.setSupportRefreshToken(true);
        tokenServices.setReuseRefreshToken(true);

//        // 访问令牌 有效期: 2小时，默认为 12小时
//        tokenServices.setAccessTokenValiditySeconds(2 * 60 * 60);
//        // 刷新令牌 有效期：7天，默认为30天
//        tokenServices.setRefreshTokenValiditySeconds(15 * 24 * 60 * 60);

        // 替换自定义的客户端管理类（JDBC方式）
        tokenServices.setClientDetailsService(clientDetails());
        tokenServices.setTokenEnhancer(tokenEnhancerChain);

        // 替换默认实现，使用自定义的用户管理接口
        PreAuthenticatedAuthenticationProvider provider = new PreAuthenticatedAuthenticationProvider();
        provider.setPreAuthenticatedUserDetailsService(new UserDetailsByNameServiceWrapper<>(this.customUserService));
        tokenServices.setAuthenticationManager(new ProviderManager(Collections.singletonList(provider)));
        return tokenServices;
    }

    @Bean
    public TokenEnhancer tokenEnhancer() {
        // Token中存放自定义信息
        // 匿名内部类方式实现 TokenEnhancer 接口
        return (accessToken, authentication) -> {
            Map<String, Object> additionalInfo = new HashMap<>(1);
            CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
            additionalInfo.put("id", userDetails.getId());
            additionalInfo.put("userId", userDetails.getId());
            additionalInfo.put("username", userDetails.getUsername());
            additionalInfo.put("email", userDetails.getEmail());
            additionalInfo.put("mobile", userDetails.getMobile());
            additionalInfo.put("clientId", userDetails.getClientId());
            ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
            return accessToken;
        };
    }

    @Bean("jdbcClientDetailsService")
    @Primary // 指定使用自定义的 Bean, 否则会被 Proxy 覆盖
    public JdbcClientDetailsService clientDetails() {
        return new JdbcClientDetailsService(dataSource);
    }

    @Bean("jdbcAuthorizationCodeServices")
    @Primary
    public JdbcAuthorizationCodeServices jdbcAuthorizationCodeServices() {
        return new JdbcAuthorizationCodeServices(dataSource);
    }

    /**
     * 配置 JWT 使用非对称加密方式来验证
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setKeyPair(keyPair());
        return converter;
    }

    @Bean
    public KeyPair keyPair() {
        // 从classpath下的证书中获取秘钥对
        KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(
                new ClassPathResource(OAuthConstant.JWT_KEY_STORE_PATH), OAuthConstant.JWT_KEY_STORE_PASS.toCharArray());
        return keyStoreKeyFactory.getKeyPair(OAuthConstant.JWT_KEY_STORE_ALIAS,
                OAuthConstant.JWT_KEY_STORE_PASS.toCharArray());
    }

    @Bean
    public TokenStore redisTokenStore() {
        return new RedisTokenStore(redisConnectionFactory);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
