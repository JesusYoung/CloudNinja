package cn.com.yangshj.base.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * Base Entity
 *
 * Create by yangshijie on 2021-12-01
 */
@Data
@ToString
public abstract class BaseEntity implements Serializable {

    private Long createBy;
    private Date createTime;
}
