package cn.com.yangshj.user.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户
 *
 * @author yangshj
 * @since 2022/7/22 10:16 上午
 */
@Data
public class User implements Serializable {

    private String id;
    private String name;
    private String email;
    private String mobile;
    private String password;
    private Integer status;
    private String description;
    private String createBy;
    private Long createTime;
    private String updateBy;
    private Long updateTime;
    private Boolean isDeleted;
}
