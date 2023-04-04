package cn.com.yangshj.rabc.vo;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 用户登录入参
 *
 * @author yangshj
 * @since 2023/4/4 15:18
 */
@Data
@ToString
public class LoginVO {

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty("用户名")
    private String username;

    @NotBlank(message = "密码不能为空")
    @ApiModelProperty("密码")
    private String password;
}
