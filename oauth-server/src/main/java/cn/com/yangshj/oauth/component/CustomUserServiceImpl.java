package cn.com.yangshj.oauth.component;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author yangshj
 * @since 2022/7/19 3:23 下午
 */
@Service
public class CustomUserServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        // ...

        CustomUserDetails userDetails = new CustomUserDetails();

        userDetails.setUsername("admin");
        userDetails.setPassword(new BCryptPasswordEncoder().encode("admin"));
        userDetails.setEnabled(true);
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        userDetails.setAuthorities(authorities);

        if (!userDetails.isEnabled()) {
            throw new DisabledException("用户已被禁用");
        } else if (!userDetails.isAccountNonLocked()) {
            throw new LockedException("用户已被锁");
        } else if (!userDetails.isAccountNonExpired()) {
            throw new AccountExpiredException("账号已过期");
        } else if (!userDetails.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException("证书过期");
        }
        System.out.println("user: " + userDetails);
        return userDetails;
    }
}
