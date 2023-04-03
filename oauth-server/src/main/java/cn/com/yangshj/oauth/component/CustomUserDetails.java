package cn.com.yangshj.oauth.component;

import java.util.ArrayList;
import java.util.Collection;

import cn.com.yangshj.base.entity.AuthUser;
import lombok.Data;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 自定义用户信息实体类
 *
 * @author yangshj
 * @since 2023/3/31 11:20
 */
@Data
@ToString
public class CustomUserDetails implements UserDetails {

    /**
     * ID
     */
    private String id;

    /**
     * 用户编号
     */
    private String code;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态
     */
    private Boolean enabled;

    /**
     * 登录客户端ID
     */
    private String clientId;

    /**
     * 权限数据
     */
    private Collection<SimpleGrantedAuthority> authorities;

    /**
     * 构造用户详情
     */
    public CustomUserDetails(AuthUser authUser) {
        this.setId(authUser.getId());
        this.setCode(authUser.getCode());
        this.setUsername(authUser.getName());
        this.setEmail(authUser.getEmail());
        this.setMobile(authUser.getPhoneNumber());
        this.setPassword(authUser.getPassword());
        this.setClientId(authUser.getClientId());
        this.setEnabled(Integer.valueOf(1).equals(authUser.getStatus()));
        if (authUser.getRoleList() != null) {
            authorities = new ArrayList<>();
            authUser.getRoleList().forEach(item -> authorities.add(new SimpleGrantedAuthority(item)));
        }
    }

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
