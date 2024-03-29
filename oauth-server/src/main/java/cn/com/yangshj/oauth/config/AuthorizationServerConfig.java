package cn.com.yangshj.oauth.config;


import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.com.yangshj.oauth.component.CustomUserServiceImpl;
import cn.com.yangshj.oauth.custom.sms.SmsCodeTokenGranter;
import cn.com.yangshj.oauth.custom.sms.SmsUserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.CompositeTokenGranter;
import org.springframework.security.oauth2.provider.OAuth2RequestFactory;
import org.springframework.security.oauth2.provider.TokenGranter;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.client.ClientCredentialsTokenGranter;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeTokenGranter;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.RandomValueAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.implicit.ImplicitTokenGranter;
import org.springframework.security.oauth2.provider.password.ResourceOwnerPasswordTokenGranter;
import org.springframework.security.oauth2.provider.refresh.RefreshTokenGranter;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.util.ObjectUtils;

/**
 * 授权服务配置
 *
 * @author yangshj
 * @since 2023/3/21 17:11
 */
@Configuration
@EnableAuthorizationServer // 开启授权服务器
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Resource
    private TokenStore redisTokenStore;
    @Resource
    private AuthenticationManager authenticationManager;
    @Resource
    private RandomValueAuthorizationCodeServices authorizationCodeServices;

    @Resource(name = "jdbcClientDetailsService")
    private JdbcClientDetailsService jdbcClientDetailsService;
    @Resource(name = "jdbcAuthorizationCodeServices")
    private JdbcAuthorizationCodeServices jdbcAuthorizationCodeServices;
    @Resource
    private AuthorizationServerTokenServices tokenServices;


    @Resource
    private SmsUserDetailsServiceImpl smsUserDetailsService;


    /**
     * ClientDetailsServiceConfigurer 为客户端配置类
     *      配置客户端的 service，也就是应用怎么获取到客户端的信息
     *
     *      1、该配置类用来配置客户端详情服务 ClientDetailsService
     *
     * @param clients 客户端
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 在授权服务器中存储客户端信息有两种方式:
        //      1、一种就是基于内存级别的存储
        //      2、一种则是通过 JDBC 在数据库中存储详情信息


        // 使用JDBC数据库配置方式
        // 查询存储的 client_id、client_secret、token 时间、权限范围、授权模式等信息
        // client 相关信息提前初始化到数据库中，client_secret 需要加密后存储
        clients.withClientDetails(jdbcClientDetailsService);

//        // 基于内存配置方式
//        // secret 需要使用加密存入，否则会报没有对应的加密方式
//        clients.inMemory()
//                .withClient("cloud_ninja_client")
//                .secret(new BCryptPasswordEncoder().encode("cloud_ninja"))
//                .authorizedGrantTypes("password", "authorization_code", "refresh_token")
//                .scopes("all");
    }

    /**
     * 配置授权服务器的安全信息，比如 ssl 配置、checkToken 是否允许访问，
     * 是否允许客户端的表单身份验证等。
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security
                // 允许表单认证
                // 如果配置，且url中有client_id和client_secret的，则走 ClientCredentialsTokenEndpointFilter
                // 如果没有配置，但是url中没有client_id和client_secret的，走basic认证保护
                .allowFormAuthenticationForClients()

                // 开启 /oauth/token_key
                // 打开验证 Token 的访问权限
                .tokenKeyAccess("permitAll()")
                // 开启 /oauth/check_token
                .checkTokenAccess("permitAll()")
                ;
    }

    /**
     * EnableAuthorizationServer 注解会暴露一系列的端点，而授权过程是使用 AuthorizationEndpoint 这个端点进行控制的，
     * 要想对该端点的行为进行配置，可以使用 AuthorizationServerEndpointsConfigurer 这个配置类
     *
     * 配置授权服务器各个端点的非安全功能，如令牌存储，令牌自定义，用户批准和授权类型
     * 如果需要密码授权模式，需要提供 AuthenticationManager 的 bean
     *
     *
     * @param endpoints endpoints
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
//                // 使用 jdbc 数据库方式存储用户的授权批准记录
//                .approvalStore(this.approvalStore())
                // 支持 GET、POST 请求
                .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST)
//                .tokenStore(redisTokenStore)
                // 自定义Token管理器
                .tokenGranter(this.tokenGranter())
                // 默认使用内存存储
//                .authorizationCodeServices(authorizationCodeServices)
                // 配置 JDBC 数据库方式存储授权码
                .authorizationCodeServices(jdbcAuthorizationCodeServices)
//                .exceptionTranslator(webResponseExceptionTranslator)
                // 使用了密码授权模式，需要配置 AuthenticationManager 的 bean，不配置会报错：Unsupported grant type: password
                .authenticationManager(authenticationManager);
    }

    /**
     * OAuth2.0 中默认实现 CompositeTokenGranter 方式，管理多种授权模式
     *
     * 自定义 tokenGranter 添加自定义配置的多种授权模式
     *
     */
    @Bean
    public TokenGranter tokenGranter() {
        return new TokenGranter() {
            private CompositeTokenGranter delegate;

            @Override
            public OAuth2AccessToken grant(String grantType, TokenRequest tokenRequest) {
                if (ObjectUtils.isEmpty(delegate)) {
                    delegate = new CompositeTokenGranter(getAllTokenGranters());
                }
                return delegate.grant(grantType, tokenRequest);
            }
        };
    }

    /**
     * 所有授权模式：默认的5种模式 + 自定义的模式
     *
     * 除了 OAuth2.0 的默认模式，还添加了自定义的短信验证码、图片验证码、邮件验证码登方式
     * 将自定义的实现添加到 CompositeTokenGranter 中
     */
    private List<TokenGranter> getAllTokenGranters() {
        OAuth2RequestFactory requestFactory = requestFactory();
        // 获取默认的授权模式
        List<TokenGranter> tokenGranters = getDefaultTokenGranters(tokenServices, authorizationCodeServices,
                requestFactory);
        if (!ObjectUtils.isEmpty(authenticationManager)) {
            // TODO 待实现
            // 短信验证模式
            tokenGranters.add(new SmsCodeTokenGranter(tokenServices, jdbcClientDetailsService, smsUserDetailsService,
                    requestFactory));
            // 邮件验证模式
            // 图片验证码模式（扩展用户名密码）
        }
        return tokenGranters;
    }

    /**
     * 默认的授权模式
     * 重新实现，配置了自定义的 TokenService、OAuth2RequestFactory、客户端信息服务（数据库方式）等对象
     *
     * 源码中默认添加了授权码模式、隐式模式、刷新Token模式、客户端模式，
     * 如果配置了 authenticationManager 对象，还有资源拥有者模式（密码模式）
     *
     * @param tokenServices tokenServices
     * @param authorizationCodeServices authorizationCodeServices
     * @param requestFactory requestFactory
     */
    private List<TokenGranter> getDefaultTokenGranters(AuthorizationServerTokenServices tokenServices,
                                                       AuthorizationCodeServices authorizationCodeServices,
                                                       OAuth2RequestFactory requestFactory) {
        List<TokenGranter> tokenGranters = new ArrayList<>();
        // 授权码
        tokenGranters.add(new AuthorizationCodeTokenGranter(tokenServices, authorizationCodeServices,
                jdbcClientDetailsService, requestFactory));
        // 刷新令牌
        tokenGranters.add(new RefreshTokenGranter(tokenServices, jdbcClientDetailsService, requestFactory));
        // 隐式模式
        tokenGranters.add(new ImplicitTokenGranter(tokenServices, jdbcClientDetailsService, requestFactory));
        // 客户端
        tokenGranters.add(new ClientCredentialsTokenGranter(tokenServices, jdbcClientDetailsService, requestFactory));
        if (!ObjectUtils.isEmpty(authenticationManager)) {
            // 用户名密码
            tokenGranters.add(new ResourceOwnerPasswordTokenGranter(authenticationManager, tokenServices,
                    jdbcClientDetailsService, requestFactory));
        }
        return tokenGranters;
    }

    /**
     * 管理 OAuth2 的请求参数策略
     *      默认实现：DefaultOAuth2RequestFactory 类
     *
     * OAuth2RequestFactory的默认实现，它初始化参数映射中的字段，
     * 验证授权类型(grant_type)和范围(scope)，并使用客户端的默认值填充范围(scope)
     */
    @Bean
    public OAuth2RequestFactory requestFactory() {
        return new DefaultOAuth2RequestFactory(jdbcClientDetailsService);
    }
}
