package cn.com.yangshj.oauth.component;

import java.util.Collection;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 *
 * @author yangshj
 * @since 2022/7/19 3:24 下午
 */
@NoArgsConstructor
@Data
public class CustomUserDetails implements UserDetails {

    private String id;
    private String code;
    private String email;
    private String mobile;
    private String username;
    private String password;
    /**
     * 用户状态
     */
    private Boolean enabled;
    private String clientId;

    /**
     * 权限数据
     */
    private Collection<SimpleGrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
