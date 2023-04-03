package cn.com.yangshj.oauth.component;

import javax.annotation.Resource;

import cn.com.yangshj.base.entity.AuthUser;
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
 * 自定义用户信息查询接口
 *
 * @author yangshj
 * @since 2023/3/31 11:22
 */
@Service
public class CustomUserServiceImpl implements UserDetailsService {

    @Resource
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser authUser = this.userService.getAuthUserDetailByName(username);
        if (authUser == null || authUser.getId() == null) {
            throw new UsernameNotFoundException("用户名或密码有误");
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
