package cn.com.yangshj.monitor.webservice.test;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * Create by yangshijie on 4/1/22
 */
@Data
@ToString
public class ResourceInstanceDetail implements Serializable {

    private List<Info> actionList;
    private List<Info> availMetric;
    private List<Info> baseInfo;
    private List<Info> configMetric;
    private List<Info> infoMetric;
    private List<Info> performMetric;
    private List<Info> serviceList;

    private String componentType;
    private String instanceCategoryId;
    private String instanceCategoryName;
    private String instanceId;
    private String instanceName;
    private String instanceState;
    private String ipAddress;
    private String isChildInstance;
    private String localtion;
    private String loginResult;
    private String maintenancePeople;
    private String monitorState;
    private String parentInstanceName;
    private String telPhone;
}
