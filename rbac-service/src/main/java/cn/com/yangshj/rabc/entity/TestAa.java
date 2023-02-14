package cn.com.yangshj.rabc.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import liquibase.pro.packaged.A;
import liquibase.pro.packaged.L;
import liquibase.pro.packaged.O;
import lombok.Data;
import lombok.ToString;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ObjectUtils;

/**
 * @author yangshj
 * @since 2023/1/10 16:59
 */
public class TestAa {


    public static void main(String[] args) {
        TestAa testAa = new TestAa();
        String json = "{\"version\":\"v1.0.0\",\"description\":\"脚本功能描述\",\"upPara\":{\"login\":{\"note\":\"登录参数\",\"shortNote\":\"登录参数\",\"required\":\"Y\",\"valueType\":\"OBJECT\",\"nests\":{\"auth_mode\":{\"shortNote\":\"授权模式\",\"note\":\"授权模式 KEY/PASSWORD\",\"required\":\"Y\",\"valueType\":\"ENUM\",\"encrypt\":\"Y\",\"values\":[{\"value\":\"KEY\",\"defaultValue\":false,\"desc\":\"\"},{\"value\":\"PASSWORD\",\"defaultValue\":true,\"desc\":\"\"}]},\"host_ip\":{\"shortNote\":\"主机地址\",\"note\":\"主机登录IP地址\",\"required\":\"Y\",\"valueType\":\"STRING\",\"encrypt\":\"N\",\"values\":[{\"value\":\"PASSWORD\",\"defaultValue\":true,\"desc\":\"\"}]},\"host_port\":{\"shortNote\":\"主机端口\",\"note\":\"主机SSH连接端口\",\"required\":\"Y\",\"valueType\":\"STRING\",\"encrypt\":\"N\",\"values\":[{\"value\":\"22\",\"defaultValue\":true,\"desc\":\"\"}]},\"host_user\":{\"shortNote\":\"登录用户\",\"note\":\"主机SSH登录用户\",\"required\":\"Y\",\"valueType\":\"STRING\",\"encrypt\":\"N\",\"values\":[{\"value\":\"root\",\"defaultValue\":true,\"desc\":\"\"}]},\"host_password\":{\"shortNote\":\"密码或私钥文件\",\"note\":\"主机SSH登录用户密码或私钥文件路径\",\"required\":\"Y\",\"valueType\":\"STRING\",\"encrypt\":\"N\"},\"host_role\":{\"shortNote\":\"主机角色\",\"note\":\"主机角色\",\"required\":\"Y\",\"valueType\":\"ENUM\",\"encrypt\":\"N\",\"values\":[{\"value\":\"GENERAL\",\"defaultValue\":true},{\"value\":\"MASTER\",\"defaultValue\":false},{\"value\":\"SLAVE\",\"defaultValue\":false},{\"value\":\"RACMASTER\",\"defaultValue\":false},{\"value\":\"RACSLAVE\",\"defaultValue\":false}]}}},\"user_name\":{\"shortNote\":\"用户名\",\"note\":\"用户名\",\"required\":\"Y\",\"valueType\":\"STRING\",\"encrypt\":\"N\"},\"user_pswd\":{\"shortNote\":\"密码\",\"note\":\"用户新密码\",\"required\":\"Y\",\"valueType\":\"STRING\",\"defaultValue\":\"123456\",\"encrypt\":\"Y\"},\"is_encrypt\":{\"shortNote\":\"是否加密\",\"note\":\"密码是否已加密\",\"required\":\"Y\",\"valueType\":\"ENUM\",\"encrypt\":\"Y\",\"values\":[{\"value\":\"yes\",\"defaultValue\":false},{\"value\":\"no\",\"defaultValue\":true}]}},\"downPara\":{}}";
        ScriptParamStruct paramStruct = new ScriptParamStruct();
        JSONObject jsonObject = JSONObject.parseObject(json);
        if (jsonObject.containsKey("version")) {
            paramStruct.setVersion(jsonObject.getString("version"));
        }
        if (jsonObject.containsKey("description")) {
            paramStruct.setDescription(jsonObject.getString("description"));
        }
        if (jsonObject.containsKey("upPara")) {
//            AbstractParaStruct upParaStruct = testAa.getFiledMetaData(jsonObject.getJSONObject("upPara"), "upPara");
//            paramStruct.setUpPara(upParaStruct);

            AbstractParaStruct up = JSONUtil.toBean(jsonObject.getJSONObject("upPara"), AbstractParaStruct.class);
            paramStruct.setUpPara(up);
        }
        if (jsonObject.containsKey("downPara")) {
//            AbstractParaStruct downParaStruct = testAa.getFiledMetaData(jsonObject.getJSONObject("downPara"), "downPara");
//            paramStruct.setDownPara(downParaStruct);
        }
        System.out.println("aaa: \n" + paramStruct.toString());
        System.out.println("bbb: \n" + JSONObject.toJSONString(paramStruct));

        String a = testAa.formatToFromStruct(paramStruct.getUpPara(), "upPara");

    }

    private String formatToFromStruct(AbstractParaStruct paraStruct, String groupName) {
        String jsonStr = JSON.toJSONString(paraStruct);
        JSONObject jsonObject = JSON.parseObject(jsonStr);

        List<FieldMetaData> fieldMetaDataList = this.getFiledMetaData(jsonObject, groupName);

        ScriptParaFormStruct struct = new ScriptParaFormStruct();
        List<ScriptParaFormStruct.FormParamStruct> formParamStructs = new ArrayList<>();
        this.aaa(fieldMetaDataList, "", formParamStructs);
        struct.setList(formParamStructs);

        ScriptParaFormStruct.ConfigStruct configStruct = new ScriptParaFormStruct.ConfigStruct();
        struct.setConfig(configStruct);

        System.out.println("aaa: \n" + JSONObject.toJSONString(struct) + "\n");
        return null;
    }

    private void aaa(List<FieldMetaData> metaDataList, String parentKey,
                                                     List<ScriptParaFormStruct.FormParamStruct> formParamStructs) {
        metaDataList.forEach(e -> {
            ScriptParaFormStruct.FormParamStruct paramStruct = new ScriptParaFormStruct.FormParamStruct();
            String key = getUUID();
            paramStruct.setKey(key);
            paramStruct.setLabel(e.getShortNote());
            paramStruct.setType("input");
            paramStruct.setModel(e.getFiledName());
            paramStruct.setParent(parentKey);
            paramStruct.setCategory("parameter");

            ScriptParaFormStruct.OptionStruct optionStructs = new ScriptParaFormStruct.OptionStruct();
            optionStructs.setRules(new ScriptParaFormStruct.RuleStruct());
            List<ScriptParaFormStruct.RuleStruct> ruleStructs = new ArrayList<>();
            ruleStructs.add(new ScriptParaFormStruct.RuleStruct());
            paramStruct.setOptions(optionStructs);
            paramStruct.setRules(ruleStructs);
            formParamStructs.add(paramStruct);
            if (!ObjectUtils.isEmpty(e.getNests())) {
                aaa(e.getNests(), key, formParamStructs);
            }
        });
    }


    private List<FieldMetaData> getFiledMetaData(JSONObject jsonObject, String groupKeyName) {
        Set<String> keySet = jsonObject.keySet();
        if (ObjectUtils.isEmpty(keySet)) {
            return null;
        }
        List<FieldMetaData> fieldList = new ArrayList<>();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().toString();
            System.out.println("===============key: " + key);
            JSONObject chileJsonObject = jsonObject.getJSONObject(key);
            FieldMetaData fieldMetaData = JSONUtil.toBean(chileJsonObject, FieldMetaData.class);
            fieldMetaData.setFiledName(key);
            fieldMetaData.setGroup(groupKeyName);
            if (chileJsonObject.containsKey("nests")) {
                List<FieldMetaData> nests = getFiledMetaData(chileJsonObject.getJSONObject("nests"), "nests");
                fieldMetaData.setNests(nests);
            }
            fieldList.add(fieldMetaData);
            System.out.println("key: " + key + "'s values \n" + fieldMetaData.toString());
        }
        return fieldList;
    }

//    public static void main(String[] args) {
//        String json = "{\"version\":\"v1.0.0\",\"description\":\"Linux系统修改用户密码\",\"params\":{\"login\":[{\"field\":\"auth_mode\",\"shortNote\":\"授权模式\",\"note\":\"授权模式 KEY/PASSWORD\",\"required\":\"Y\",\"type\":\"enum\",\"availableValue\":[\"KEY\",\"PASSWORD\"],\"defalutValue\":\"PASSWORD\",\"encrypt\":\"N\",\"group\":\"目标主机\"},{\"field\":\"host_ip\",\"shortNote\":\"主机地址\",\"note\":\"主机登录IP地址\",\"required\":\"Y\",\"type\":\"string\",\"defalutValue\":\"PASSWORD\",\"encrypt\":\"N\",\"group\":\"目标主机\"},{\"field\":\"host_port\",\"shortNote\":\"主机端口\",\"note\":\"主机SSH连接端口\",\"required\":\"Y\",\"type\":\"string\",\"defalutValue\":\"22\",\"encrypt\":\"N\",\"group\":\"目标主机\"},{\"field\":\"host_user\",\"shortNote\":\"登录用户\",\"note\":\"主机SSH登录用户\",\"required\":\"Y\",\"type\":\"string\",\"defalutValue\":\"root\",\"group\":\"目标主机\"},{\"field\":\"host_password\",\"shortNote\":\"密码或私钥文件\",\"note\":\"主机SSH登录用户密码或私钥文件路径\",\"required\":\"Y\",\"type\":\"string\",\"defalutValue\":\"\",\"encrypt\":\"Y\",\"group\":\"目标主机\"},{\"field\":\"host_role\",\"shortNote\":\"主机角色\",\"note\":\"主机角色\",\"required\":\"Y\",\"type\":\"enum\",\"availableValue\":[\"GENERAL\",\"MASTER\",\"SLAVE\",\"RACMASTER\",\"RACSLAVE\"],\"defalutValue\":\"GENERAL\",\"encrypt\":\"N\",\"group\":\"目标主机\"}],\"su_user\":[{\"field\":\"host_su_user\",\"shortNote\":\"用户名\",\"note\":\"主机SU用户名\",\"required\":\"N\",\"defalutValue\":\"\",\"encrypt\":\"N\",\"group\":\"SU用户\"},{\"field\":\"host_su_password\",\"shortNote\":\"密码\",\"note\":\"用户密码\",\"required\":\"N\",\"defalutValue\":\"\",\"encrypt\":\"N\",\"group\":\"SU用户\"}],\"parameter\":[{\"field\":\"user_name\",\"shortNote\":\"用户名\",\"note\":\"Linux系统中一个用户名\",\"required\":\"Y\",\"type\":\"string\",\"defaultValue\":\"\",\"encrypt\":\"N\",\"group\":\"用户\"},{\"field\":\"user_pswd\",\"shortNote\":\"密码\",\"note\":\"用户新密码\",\"required\":\"Y\",\"type\":\"string\",\"defaultValue\":\"123456\",\"encrypt\":\"Y\",\"group\":\"密码\"},{\"field\":\"is_encrypt\",\"shortNote\":\"是否加密\",\"note\":\"密码是否已加密\",\"required\":\"N\",\"type\":\"enum\",\"availableValue\":[\"yes\",\"no\"],\"defaultValue\":\"no\",\"encrypt\":\"N\",\"group\":\"密码\"}]},\"result\":[{\"field\":\"status\",\"shortNote\":\"执行状态\",\"note\":\"脚本执行结果状态\",\"required\":\"Y\",\"type\":\"enum\",\"availableValue\":[\"SUCCESS\",\"ParameterException\",\"ExecuteException\"],\"defaultValue\":\"yes\",\"encrypt\":\"N\",\"group\":\"执行状态\"},{\"field\":\"status\",\"shortNote\":\"运行信息\",\"note\":\"脚本执行异常信息\",\"required\":\"Y\",\"type\":\"string\",\"availableValue\":[],\"defaultValue\":\"\",\"encrypt\":\"N\",\"group\":\"执行状态\"}]}";
//
//        ScriptParamEntity scriptParamEntity = new ScriptParamEntity();
//
//        JSONObject jsonObject = JSONObject.parseObject(json);
//        scriptParamEntity.setVersion(jsonObject.getString("version"));
//        scriptParamEntity.setDescription(jsonObject.getString("description"));
//
//        JSONObject paramJson = jsonObject.getJSONObject("params");
//        Set<String> keys = paramJson.keySet();
//        Iterator iterator = keys.iterator();
//
//        Map<String, List<ScriptParamEntity.MetaDataInfo>> paramMap = new HashMap<>();
//        while (iterator.hasNext()) {
//            String key = iterator.next().toString();
//            System.out.println("key: " + key);
//            JSONArray jsonArray = paramJson.getJSONArray(key);
//            List<ScriptParamEntity.MetaDataInfo> metaList = jsonArray.stream()
//                    .map(e -> {
//                        ScriptParamEntity.MetaDataInfo meta = JSONObject.parseObject(e.toString(), ScriptParamEntity.MetaDataInfo.class);
//                        System.out.println("meta: " + meta.toString());
//                        return meta;
//                    })
//                    .collect(Collectors.toList());
//
//            paramMap.put(key, metaList);
//        }
//        scriptParamEntity.setParamMap(paramMap);
//
//        JSONArray resultJsonArray = jsonObject.getJSONArray("result");
//        List<ScriptParamEntity.MetaDataInfo> resultMetaList = resultJsonArray.stream()
//                .map(e -> {
//                    ScriptParamEntity.MetaDataInfo meta = JSONObject.parseObject(e.toString(), ScriptParamEntity.MetaDataInfo.class);
//                    System.out.println("meta: " + meta.toString());
//                    return meta;
//                })
//                .collect(Collectors.toList());
//        scriptParamEntity.setResult(resultMetaList);
//
//        System.out.println("-----------------------------------");
//        System.out.println("entry: " + scriptParamEntity.toString());
//
//
//        System.out.println("json: \n" + JSONObject.toJSONString(scriptParamEntity));
//    }
//
//    @Data
//    @ToString
//    public static class ScriptParamEntity {
//
//
//        private String version;
//        private String description;
//        private List<MetaDataInfo> result;
//        private Map<String, List<MetaDataInfo>> paramMap;
//
//        /**
//         * 字段实体
//         */
//        @Data
//        @ToString
//        public static class MetaDataInfo {
//
//            // 字段名称
//            private String shortNote;
//
//            // 字段说明
//            private String note;
//
//            // 是否必填  Y:是  N:否
//            private String required;
//
//            // 字段类型
//            private String type;
//
//            // 默认值
//            private String defaultValue;
//
//            // 是否加密  Y:是  N:否
//            private String encrypt;
//
//            // 组
//            private String group;
//
//            // 可选值
//            private List<String> availableValue;
//        }
//
//
//
//    }


    private static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-", "");
    }
}
