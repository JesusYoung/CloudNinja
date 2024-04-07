package cn.com.yangshj.rabc.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import net.bytebuddy.build.ToStringPlugin;

/**
 * 用户信息入参
 *
 * @author yangshj
 * @since 2023/3/27 15:54
 */
@Data
@ToString
public class UserInfoVo {

    @NotBlank(message = "用户名不能为空")
    @ApiModelProperty("用户名")
    private String name;

    @NotNull(message = "邮箱不能为空")
    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("手机号")
    private String phoneNumber;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("状态 I状态 1 启用 2 禁用")
    private Integer status;

    @ApiModelProperty("备注")
    private String description;

    @ApiModelProperty("所属机构")
    private List<String> orgIdList;
}
