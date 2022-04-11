package cn.com.yangshj.monitor.webservice.test;

import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshijie on 3/31/22
 */
@Data
@ToString
public class Result<T> {

    private Integer result;
    private T data;
}
