package cn.com.yangshj.monitor.webservice.test;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshijie on 3/31/22
 */
@Data
@ToString
public class ResourceInfo {

    private String resourceType;
    @JSONField(name = "IP")
    private String IP;
    @JSONField(name = "UserName")
    private String UserName;
    @JSONField(name = "Password")
    private String Password;
    @JSONField(name = "SSHPort")
    private String SSHPort;
    @JSONField(name = "MRAMPort")
    private String MRAMPort;
}
