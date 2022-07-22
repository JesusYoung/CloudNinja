package cn.com.yangshj.base.entity;

import lombok.Data;

/**
 * @author yangshj
 * @since 2022/7/20 2:51 下午
 */
@Data
public class UserDto {

    private String id;
    private String code;
    private String email;
    private String mobile;
    private String username;
    private String password;
}
