package cn.com.yangshj.rabc.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * 用户实体类
 *
 * @author yangshj
 * @since 2023/3/24 15:18
 */
@Data
@ToString
public class UserInfo implements Serializable {

    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 组织结构ID
     */
    private String organizationId;

    /**
     * 状态 1:启用  2:禁用
     */
    private Integer status;

    /**
     * 描述
     */
    private String description;


    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 是否删除 0-未删除 1-已删除
     */
    private Boolean isDeleted;
}
