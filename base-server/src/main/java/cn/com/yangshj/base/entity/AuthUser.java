package cn.com.yangshj.base.entity;

import java.util.List;

//import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 认证用户信息
 *
 * @author yangshj
 * @since 2023/3/24 14:10
 */
@Data
@ToString
public class AuthUser {

//    @ApiModelProperty("用户ID")
    private String id;

//    @ApiModelProperty("用户编号")
    private String code;

//    @ApiModelProperty("用户邮箱")
    private String email;

//    @ApiModelProperty("手机")
    private String phoneNumber;

//    @ApiModelProperty("用户名")
    private String name;

//    @ApiModelProperty("密码")
    private String password;

//    @ApiModelProperty("状态1 可用 2 不可用")
    private Integer status;

//    @ApiModelProperty("客户端ID")
    private String clientId;

//    @ApiModelProperty("角色列表 id_name")
    private List<String> roleList;
}
