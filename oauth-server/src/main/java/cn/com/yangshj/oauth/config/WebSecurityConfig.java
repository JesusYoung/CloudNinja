package cn.com.yangshj.oauth.config;


import javax.annotation.Resource;

import cn.com.yangshj.oauth.component.CustomUserServiceImpl;
import cn.com.yangshj.oauth.config.handler.AuthFailureHandler;
import cn.com.yangshj.oauth.config.handler.AuthSuccessHandler;
import cn.com.yangshj.oauth.custom.sms.SmsCodeAuthenticationFilter;
import cn.com.yangshj.oauth.custom.sms.SmsCodeAuthenticationSecurityConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 设置用户认证信息所依赖的配置类
 *
 * @author yangshj
 * @since 2023/3/22 16:53
 */
@Slf4j
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private AuthSuccessHandler authSuccessHandler;
    @Resource
    private AuthFailureHandler authFailureHandler;

    @Resource
    private SmsCodeAuthenticationSecurityConfig smsCodeAuthenticationSecurityConfig;

    @Resource
    private CustomUserServiceImpl customUserService;


    private final String[] antPatterns = new String[] {
            "static/oauth/login",
        "/oauth/**",
        "/v3/api-docs",
        "/v2/api-docs",
        "/swagger-ui/index.html"
    };


    /**
     * 开放 /oauth/login 和 /oauth/authorize 两个路径的匿名访问，前者用于登录，后者用于换授权码，这两个端点访问的时机都在登录之前
     * 设置 oauth/login 使用表单验证进行登录
     *
     *
     *
     * security 框架中默认实现
     *      http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
     * 		http.formLogin();
     * 		http.httpBasic();
     *
     *
     *
     * @param http http
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.apply(smsCodeAuthenticationSecurityConfig)
                .and()
                .authorizeRequests()
                .antMatchers(antPatterns).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/oauth/login") // 自定义登录页面
                .loginProcessingUrl("/oauth/login") // 登录表单提交时的处理地址
//                .defaultSuccessUrl("/index") // 登录认证成功后的跳转页面
                .successHandler(authSuccessHandler)
                .failureHandler(authFailureHandler)
                .and()
                // 关闭 CSRF 跨域
                .csrf().disable()
                .httpBasic()
        ;

    }

    /**
     * AuthenticationManagerBuilder 工具类为开发人员提供了基于内存、JDBC、LDAP 等多种验证方案
     *
     * 配置用户账户的认证方式，显然把用户存在了数据库中希望配置JDBC的方式
     * 配置了使用 BCryptPasswordEncoder 哈希来保存用户的密码（生产环境中，用户密码肯定不能是明文保存的）
     *
     * @param auth auth
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 基于 JDBC 方式
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .passwordEncoder(new BCryptPasswordEncoder());


//        // 基于内存方式
//        auth.inMemoryAuthentication()
//                .withUser("spring_user").password("{noop}password1").roles("USER")
//                .and()
//                .withUser("spring_admin").password("{noop}password2").roles("USER", "ADMIN");

        auth.userDetailsService(customUserService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    /**
     * 认证管理
     *
     * @return 认证管理对象
     */
    @Bean // 重点是这行，父类并没有将它注册为一个 Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        // oauth2 密码模式需要拿到这个bean
        return super.authenticationManagerBean();
    }
}
