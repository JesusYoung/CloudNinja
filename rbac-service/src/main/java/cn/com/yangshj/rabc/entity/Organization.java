package cn.com.yangshj.rabc.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 组织机构实体类
 *
 * @author yangshj
 * @since 2023/3/24 15:21
 */
@Data
@ToString
public class Organization {

    private String id;

    /**
     * 组织名称
     */
    private String name;
}
