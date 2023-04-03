package cn.com.yangshj.rabc.test;

import lombok.Data;

/**
 * 值元数据
 *
 * @author yangshj
 * @since 2023/1/12 10:55
 */
@Data
public class ValueMetaData {

    /**
     * value值
     */
    private String value;

    /**
     * 是否为默认值
     */
    private Boolean defaultValue;

    /**
     * 值描述
     */
    private String desc;
}
