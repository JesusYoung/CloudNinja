package cn.com.yangshj.rabc.entity;

import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * 脚本参数表单结构
 *
 * @author yangshj
 * @since 2023/1/12 15:04
 */
@Data
@ToString
public class ScriptParaFormStruct {

    private List<FormParamStruct> list;
    private ConfigStruct config;


    @Data
    @ToString
    public static class FormParamStruct {
        private String key;
        private String type;
        private String label;
        private String model;
        private List<RuleStruct> rules;
        private String parent;
        private OptionStruct options;
        private String category;
    }

    @Data
    @ToString
    public static class OptionStruct {
        private RuleStruct rules;
        private String width = "100%";
        private String append;
        private String prefix;
        private String suffix;
        private String prepend;
        private Boolean disabled = false;
        private Boolean readonly = false;
        private Boolean clearable = false;
        private Long maxLength;
        private String placeholder;
        private String defaultValue;
        private Boolean showParamBtn = false;
    }

    @Data
    @ToString
    public static class RuleStruct {
        private String enumName;
        private String type = "any";
        private String message;
        private String pattern;
        private String trigger = "blur";
        private Boolean required = false;
    }

    @Data
    @ToString
    public static class ConfigStruct {
        private String size = "default";
        private Long labelWidth = 100L;
        private String labelPosition = "right";
        private Boolean hideRequiredAsterisk = false;
    }
}
