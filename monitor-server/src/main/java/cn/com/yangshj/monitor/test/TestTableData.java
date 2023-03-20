package cn.com.yangshj.monitor.test;

import cn.com.yangshj.base.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshijie on 2021-12-01
 */
@Data
@ToString
public class TestTableData extends BaseEntity {
    
    private Long id;
    
    private String name;

    private Long parentId;

    private Long version;
}
