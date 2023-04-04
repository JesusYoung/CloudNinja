package cn.com.yangshj.base.dto;

import lombok.Data;
import lombok.ToString;

/**
 * 认证服务Token实体类
 *
 * @author yangshj
 * @since 2023/4/4 15:30
 */
@Data
@ToString
public class OAuth2AccessTokenDTO {

    private String access_token;
    private String refresh_token;
    private String token_type;
    private Long expires_in;
    private String scope;
    private String id;
    private String userId;
    private String username;
    private String email;
    private String jti;
}
