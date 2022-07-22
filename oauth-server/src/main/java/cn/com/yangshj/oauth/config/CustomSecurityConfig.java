package cn.com.yangshj.oauth.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 *
 * @author yangshj
 * @since 2022/7/20 1:53 下午
 */
@Configuration
public class CustomSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private UserDetailsService userDetailsService;
//    @Resource
//    private AuthenticationProvider authenticationProvider;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//        auth.authenticationProvider(authenticationProvider);
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        // 1、基于权限访问控制
//        http.httpBasic();
////        // 1.1、任何请求，需要具有"ROLE_ROOT"或者"ROLE_ADMIN"任一权限才能访问
////        http.authorizeRequests().anyRequest().hasAnyAuthority("ROLE_ROOT", "ROLE_ADMIN");
//        // 1.2、任何请求，只有"ROLE_ROOT"权限才能访问
        http.authorizeRequests().anyRequest().hasAuthority("ROLE_ROOT");


        // 2、基于配置方法访问控制
        http.httpBasic();
        // 2.1、MVC匹配器(测试未生效)
        http.authorizeRequests()
//                .mvcMatchers("/getA").hasRole("ROLE_ADMIN")
                .mvcMatchers("/getB").hasRole("DELETE");

        //
        //
        //
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
