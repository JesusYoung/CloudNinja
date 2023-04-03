package cn.com.yangshj.rabc.vo;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.bytebuddy.build.ToStringPlugin;

/**
 * 用户信息入参
 *
 * @author yangshj
 * @since 2023/3/27 15:54
 */
@Data
@ToStringPlugin.Enhance
public class UserInfoVo {

    @ApiModelProperty("用户名")
    private String name;

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
