package cn.com.yangshj.rabc.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;

import lombok.Data;
import lombok.ToString;

/**
 * 参数结构基类
 *
 * @author yangshj
 * @since 2023/1/12 11:09
 */
@Data
@ToString
public class AbstractParaStruct extends LinkedHashMap<String, Object> implements Serializable {


}
