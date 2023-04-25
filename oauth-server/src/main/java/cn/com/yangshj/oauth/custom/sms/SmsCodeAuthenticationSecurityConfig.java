package cn.com.yangshj.oauth.custom.sms;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * 短信验证码认证安全配置
 *
 * @author yangshj
 * @since 2023/4/19 16:20
 */
@Configuration
public class SmsCodeAuthenticationSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain,
        HttpSecurity> {

    @Resource
    private SmsUserDetailsServiceImpl smsUserDetailsService;
    @Resource
    private SmsCodeAuthenticationSuccessHandler smsCodeAuthenticationSuccessHandler;
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public void configure(HttpSecurity builder) throws Exception {
        SmsCodeAuthenticationFilter smsCodeAuthenticationFilter = new SmsCodeAuthenticationFilter();
        // 设置AuthenticationManager
        smsCodeAuthenticationFilter.setAuthenticationManager(builder.getSharedObject(AuthenticationManager.class));
        // 设置成功失败处理器
        smsCodeAuthenticationFilter.setAuthenticationSuccessHandler(smsCodeAuthenticationSuccessHandler);

        // 设置UserDetailsService
        SmsCodeAuthenticationProvider smsCodeAuthenticationProvider = new SmsCodeAuthenticationProvider();
        smsCodeAuthenticationProvider.setSmsUserDetailsService(smsUserDetailsService);
        smsCodeAuthenticationProvider.setRedisTemplate(redisTemplate);
        // 这里说明要把自己写的Provider放在过滤链的哪里
        builder.authenticationProvider(smsCodeAuthenticationProvider)
                .addFilterAfter(smsCodeAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
