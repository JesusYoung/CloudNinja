package cn.com.yangshj.rabc.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

/**
 * Json工具类
 *
 * @author yangshj
 * @since 2023/1/12 10:51
 */
@Slf4j
public class JSONUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        // 忽略没有定义的字段
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MAPPER.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        MAPPER.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        MAPPER.setTimeZone(TimeZone.getDefault());
    }

    /**
     * JSON字符串转为对象
     */
    @SneakyThrows
    public static <T> T toBean(String json, Class<T> clazz) {
        return MAPPER.readValue(json, clazz);
    }

    @SneakyThrows
    public static <T> T toBean(Object object, Class<T> clazz) {
        return MAPPER.convertValue(object, clazz);
    }

    @SneakyThrows
    public static <T> T toBean(String json, TypeReference<T> reference)  {
        return MAPPER.readValue(json, reference);
    }

    @SneakyThrows
    public static <T> T toBean(String json, Class<?> parametrized, Class<?>... parameterClasses) {
        return MAPPER.readValue(json, parametricType(parametrized, parameterClasses));
    }

    @SneakyThrows
    public static <T> T toBean(String json, JavaType type) {
        return MAPPER.readValue(json, type);
    }

    /**
     * 构建泛型的JavaType
     *
     * @param parametrized     被泛型类，Bean<T>： Bean就是被泛型的类
     * @param parameterClasses 泛型的类，按照声明顺序。如：Bean<T1,T2>，按照T1,T2的顺序
     * @return Java类型
     */
    public static JavaType parametricType(Class<?> parametrized, Class<?>... parameterClasses) {
        return MAPPER.getTypeFactory().constructParametricType(parametrized, parameterClasses);
    }


    /**
     * 对象转为JSON字符串
     */
    @SneakyThrows
    public static String toJson(Object object) {
        return MAPPER.writeValueAsString(object);
    }


    /**
     * 将JSON字符串数组转为List
     */
    @SneakyThrows
    public static <T> List<T> toList(String json, Class<T> parameterClasses) {
        return MAPPER.readValue(json, parametricType(ArrayList.class, parameterClasses));
    }

    /**
     * 对象转换
     *
     * @param source 原对象
     * @param target 目标对象
     * @param <T>    target type
     * @return target
     */
    @SneakyThrows
    public <T> T convert(Object source, Class<T> target) {
        if (source == null) {
            return null;
        }
        return MAPPER.readValue(toJson(source), target);
    }

}
