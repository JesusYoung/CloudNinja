package cn.com.yangshj.oauth.config;


import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;

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
//    @Resource
//    private CustomUserServiceImpl customUserService;
////    @Resource
////    private RedisConnectionFactory redisConnectionFactory;
//
//    @Bean
//    @Primary
//    public AuthorizationServerTokenServices tokenServices() {
//        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
//        // 配置使用一个复合令牌增强器 TokenEnhancerChain，循环遍历将其委托给增强器
//        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(tokenEnhancer(), jwtAccessTokenConverter()));
//        DefaultTokenServices tokenServices = new DefaultTokenServices();
////        tokenServices.setTokenStore(redisTokenStore());
//        tokenServices.setSupportRefreshToken(true);
//        tokenServices.setReuseRefreshToken(true);
//
////        // 访问令牌 有效期: 2小时，默认为 12小时
////        tokenServices.setAccessTokenValiditySeconds(2 * 60 * 60);
////        // 刷新令牌 有效期：7天，默认为30天
////        tokenServices.setRefreshTokenValiditySeconds(7 * 24 * 60 * 60);
//
//        tokenServices.setTokenEnhancer(this.tokenEnhancer());
//        tokenServices.setClientDetailsService(this.clientDetails());
//
//        PreAuthenticatedAuthenticationProvider provider = new PreAuthenticatedAuthenticationProvider();
//        provider.setPreAuthenticatedUserDetailsService(new UserDetailsByNameServiceWrapper<>(this.customUserService));
//        tokenServices.setAuthenticationManager(new ProviderManager(Collections.singletonList(provider)));
//
//        return tokenServices;
//    }
//
//    @Bean
//    public TokenEnhancer tokenEnhancer() {
//        // Token 中存放自定义信息
//        // 匿名内部类方式实现 TokenEnhancer 接口
//        return (accessToken, authentication) -> {
//            Map<String, Object> additionalInfo = new HashMap<>(1);
//            // TODO ???
//            CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
//            additionalInfo.put("id", userDetails.getId());
//            additionalInfo.put("userId", userDetails.getId());
//            additionalInfo.put("username", userDetails.getUsername());
//            additionalInfo.put("email", userDetails.getEmail());
//            additionalInfo.put("mobile", userDetails.getMobile());
//            additionalInfo.put("clientId", userDetails.getClientId());
//            ((DefaultOAuth2AccessToken)accessToken).setAdditionalInformation(additionalInfo);
//            return accessToken;
//        };
//    }


    @Bean("jdbcClientDetailsService")
    @Primary // 指定使用自定义的 Bean, 否则会被 Proxy 覆盖
    public JdbcClientDetailsService clientDetails() {
        return new JdbcClientDetailsService(dataSource);
    }

//    /**
//     * 配置 JWT 使用非对称加密方式来验证
//     */
//    @Bean
//    public JwtAccessTokenConverter jwtAccessTokenConverter() {
//        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        converter.setKeyPair(keyPair());
//        return converter;
//    }
//
//    @Bean
//    public KeyPair keyPair() {
//        // 从classpath下的证书中获取秘钥对
//        KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(
//                new ClassPathResource(OAuthConstant.JWT_KEY_STORE_PATH), OAuthConstant.JWT_KEY_STORE_PASS.toCharArray());
//        return keyStoreKeyFactory.getKeyPair(OAuthConstant.JWT_KEY_STORE_ALIAS,
//                OAuthConstant.JWT_KEY_STORE_PASS.toCharArray());
//    }
//
////    public TokenStore tokenStore() {
////        return new JdbcTokenStore();
////    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
