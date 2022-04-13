package cn.com.yangshj.alert.bean;

import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshj on 4/12/22
 */
@Data
@ToString
public class LogEntity {

    private String currentUserName;
    private String time;
    private String operation;
}
