package cn.com.yangshj.rabc.entity;

import lombok.Getter;

/**
 * 参数字段类型枚举
 *
 * @author yangshj
 * @since 2023/1/12 11:03
 */
@Getter
public enum FiledValueTypeEnum {

    STRING("STRING", "字符串"),
    NUMBER("NUMBER", "数字"),
    ENUM("ENUM", "枚举"),
    DATE("DATE", "日期"),
    DATETIME("DATETIME", "日期时间"),
    OBJECT("OBJECT", "对象"),
    ARRAY("ARRAY", "数组");

    private String id;
    private String name;

    FiledValueTypeEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
