package cn.com.yangshj.rabc.test;

import java.util.List;

import lombok.Data;

/**
 * 字段元数据
 *
 * @author yangshj
 * @since 2023/1/12 10:51
 */
@Data
public class FieldMetaData {


    /**
     * 字段类别 login/parameter/result
     */
    private String group;

    /**
     * 字段标识 如auth_mode
     */
    private String filedName;

    /**
     * 字段m描述
     */
    private String note;

    /**
     * 字段描述
     */
    private String shortNote;

    /**
     * 字段类型 string/number/enum/object/text/data/datetime/array
     */
    private String valueType;

    /**
     * 是否必须 Y/N
     */
    private String required;

    /**
     * 是否加密 Y/N
     */
    private String encrypt;

    /**
     * 可选值
     */
    private List<ValueMetaData> values;

    /**
     * 子结构字段
     */
    private List<FieldMetaData> nests;
//    private AbstractParaStruct nests;
}
