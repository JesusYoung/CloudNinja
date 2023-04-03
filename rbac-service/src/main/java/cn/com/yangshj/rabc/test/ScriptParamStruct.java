package cn.com.yangshj.rabc.test;

import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * 脚本参数结构
 *
 * @author yangshj
 * @since 2023/1/12 11:08
 */
@Data
@ToString
public class ScriptParamStruct {

    private String version;
    private String description;
    private AbstractParaStruct upPara = new AbstractParaStruct();
    private AbstractParaStruct downPara  = new AbstractParaStruct();


    private List<FieldMetaData> upParaMetaData;
    private List<FieldMetaData> downParaMetaData;
}
