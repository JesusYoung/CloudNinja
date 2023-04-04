package cn.com.yangshj.oauth.config.provider;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 * 用户名密码验证登录
 *
 * @author yangshj
 * @since 2023/4/4 16:15
 */
@Slf4j
//@Component
public class CustomDaoAuthenticationProvider extends DaoAuthenticationProvider {

    @Resource
    private PasswordEncoder passwordEncoder;

    public CustomDaoAuthenticationProvider(UserDetailsService customUserService) {
        super();
        setUserDetailsService(customUserService);
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails,
                                                  UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
        if (ObjectUtils.isEmpty(authentication.getCredentials())) {
            log.error("Failed to authenticate since no credentials provided");
            throw new BadCredentialsException("用户名或密码错误");
        }
        String presentedPassword = authentication.getCredentials().toString();
        if (!passwordEncoder.matches(presentedPassword, userDetails.getPassword())) {
            log.error("Failed to authenticate since password does not match stored value");
            throw new BadCredentialsException("用户名或密码错误");
        }
    }
}
