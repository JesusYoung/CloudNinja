package cn.com.yangshj.rabc.dto;

import javax.management.relation.RoleInfo;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 用户信息返回实体类
 *
 * @author yangshj
 * @since 2023/3/27 15:56
 */
@Data
@ToString
public class UserInfoDto {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("手机号")
    private String phoneNumber;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("状态 1 启用 2 禁用")
    private Integer status;

    @ApiModelProperty("备注")
    private String description;

    @ApiModelProperty("创建人")
    private String createBy;

    @ApiModelProperty("客户端id")
    private String clientId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新人")
    private String updateBy;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("是否删除 0-未删除 1-已删除")
    private Boolean isDeleted;

//    @ApiModelProperty("状态 1-启用 2-禁用")
//    private UserStatusEnum userStatusEnum;

    @ApiModelProperty("部门id集合")
    private List<String> orgIdList;

    @ApiModelProperty("角色id集合")
    private List<String> roleIdList;

//    @ApiModelProperty("部门")
//    private String orgName;
//
//    @ApiModelProperty("角色")
//    private String roleName;
//
//    @ApiModelProperty("部d集合")
//    private List<OrgInfo> orgList;
//
//    @ApiModelProperty("角色集合")
//    private List<RoleInfo> roleList;
}
