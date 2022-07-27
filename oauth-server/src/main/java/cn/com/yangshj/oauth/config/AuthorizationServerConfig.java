package cn.com.yangshj.oauth.config;

import javax.annotation.Resource;

import cn.com.yangshj.oauth.component.CustomUserServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 *
 *
 * @author yangshj
 * @since 2022/7/27 9:58 上午
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig  extends AuthorizationServerConfigurerAdapter {

    /**
     * 认证管理器
     */
    @Resource
    private AuthenticationManager authenticationManager;
    @Resource
    private UserDetailsService userDetailsService;

//    @Resource
//    private CustomUserServiceImpl customUserService;

    /**
     * 设置客户端安全码时使用了"{noop}spring_secret"这种格式，这是因为在Spring Security 5中统一使用PasswordEncoder对密码进行编码，
     * 在设置密码时要求格式为“{id}password”，而这里的前缀“{noop}”就是代表具体PasswordEncoder的id，表示使用的是NoOpPasswordEncoder
     * "{bcrypt}" 表示使用BCryptPasswordEncoder
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory() // 基于内存存储
                .withClient("spring") // 客户端ID
                .secret("{noop}spring_secret") // 客户端安全码
//                .secret("{bcrypt}spring_secret") // 客户端安全码
                // 可选的范围包括代表授权码模式的authorization_code、代表隐式授权模式implicit、代表密码模式的password
                // 以及代表客户端凭据模式的client_credentials，这个属性在设置上也可以添加refresh_token，通过刷新操作获取
                // 以上授权模式下产生的新Token
                .authorizedGrantTypes("refresh_token", "password", "client_credentials") // 设置授权模式
                // 如果这个属性为空，客户端就拥有全部的访问范围，常见的设置方式可以是webclient或mobileclient，分别代表Web端和移动端
                .scopes("webclient", "mobileclient"); // 客户端访问范围
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager).userDetailsService(userDetailsService);
//        endpoints.authenticationManager(authenticationManager).userDetailsService(customUserService);
    }
}
