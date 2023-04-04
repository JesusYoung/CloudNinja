package cn.com.yangshj.base.dto;

import lombok.Data;
import lombok.ToString;

/**
 * 认证Token用户信息实体类
 *
 * @author yangshj
 * @since 2023/4/4 15:13
 */
@Data
@ToString
public class OAuth2TokenDTO {

    private String accessToken;
    private String refreshToken;
    private String tokenType;
    private Long expiresIn;
    private String scope;
    private String id;
    private String userId;
    private String username;
    private String email;
    private String jti;
}
