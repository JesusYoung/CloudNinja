package cn.com.yangshj.monitor.entity;

import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshijie on 3/21/22
 */
@Data
@ToString
public class MachineData {

    private String ip;
    private int port;
    private String userName;
    private String password;
}
