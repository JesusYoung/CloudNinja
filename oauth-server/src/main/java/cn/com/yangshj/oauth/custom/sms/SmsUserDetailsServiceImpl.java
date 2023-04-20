package cn.com.yangshj.oauth.custom.sms;

import javax.annotation.Resource;

import cn.com.yangshj.base.entity.AuthUser;
import cn.com.yangshj.oauth.component.CustomUserDetails;
import cn.com.yangshj.oauth.service.IUserService;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 短信验证码获取用户
 *
 * @author yangshijie
 * @since 2023/4/19 16:37
 */
@Service
public class SmsUserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private IUserService userService;


    @Override
    public UserDetails loadUserByUsername(String phoneNumber) throws UsernameNotFoundException {
        AuthUser authUser = this.userService.getAuthUserDetailByPhoneNumber(phoneNumber);
        if (authUser == null || authUser.getId() == null) {
            throw new UsernameNotFoundException("手机号或验证码有误");
        }
        CustomUserDetails userDetails = new CustomUserDetails(authUser);
        if (!userDetails.isEnabled()) {
            throw new DisabledException("用户已禁用");
        } else if (!userDetails.isAccountNonLocked()) {
            throw new LockedException("用户已被锁");
        } else if (!userDetails.isAccountNonExpired()) {
            throw new AccountExpiredException("账号已过期");
        } else if (!userDetails.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException("证书过期");
        }
        return userDetails;
    }
}
