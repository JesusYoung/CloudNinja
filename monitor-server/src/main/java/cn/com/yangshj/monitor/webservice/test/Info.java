package cn.com.yangshj.monitor.webservice.test;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshijie on 4/1/22
 */
@Data
@ToString
public class Info implements Serializable {

    private String infoId;
    private String infoName;
    private String infoValue;
    private String infoValueColor;
}
