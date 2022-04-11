package cn.com.yangshj.monitor.webservice;

import java.util.ArrayList;
import java.util.List;

import cn.com.yangshj.monitor.utils.CentOsCollectUtil;
import cn.com.yangshj.monitor.webservice.instance.*;
import cn.com.yangshj.monitor.webservice.user.LoginResultObj;
import cn.com.yangshj.monitor.webservice.user.UserServiceDevImpl;
import cn.com.yangshj.monitor.webservice.user.UserServiceDevImplPortType;
import org.apache.ibatis.annotations.Param;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * Create by yangshijie on 3/25/22
 */
@RestController
@RequestMapping("/api/v1/ws")
public class WsController {

    @GetMapping("/verify")
    public LoginResultObj verifyUser(String appType, String loginStr, String password) {
        UserServiceDevImpl userImpl = new UserServiceDevImpl();
        UserServiceDevImplPortType aaa = userImpl.getUserServiceDevImplPort();
        LoginResultObj loginResultObj = aaa.verifyUser(appType, loginStr, password);

        System.out.println("aaa: " + loginResultObj.toString());
        System.out.println("token: " + loginResultObj.getToken().getValue());
        System.out.println("date: " + loginResultObj.getLoginDate().getValue());
        System.out.println("result: " + loginResultObj.getLoginResult().getValue());
        return loginResultObj;
    }

    @GetMapping("/detail")
    public Object getDetailById(String token, String resId) {
        ResourceInstanceServiceDevImpl resImpl = new ResourceInstanceServiceDevImpl();
        ResourceInstanceServiceDevImplPortType type = resImpl.getResourceInstanceServiceDevImplPort();

        ResInsDetailObj detail = type.getResInsDetailById(token, resId);

        List<Info> avaMetricInfo = detail.getAvailMetric().getValue().getInfo();
        System.out.println("avaMetricInfo =======================================================");
        for (Info info : avaMetricInfo) {
            System.out.println("infoId: " + info.getInfoId().getValue()
                    + ", infoName: " + info.getInfoName().getValue()
                    + ", infoValue: " + info.getInfoValue().getValue()
                    + ", infoValueColor: " + info.getInfoValueColor().getValue());

        }
        List<Info> baseInfo = detail.getBaseInfo().getValue().getInfo();
        System.out.println("baseInfo =======================================================");
        for (Info info : baseInfo) {
            System.out.println("infoId: " + info.getInfoId().getValue()
                    + ", infoName: " + info.getInfoName().getValue()
                    + ", infoValue: " + info.getInfoValue().getValue()
                    + ", infoValueColor: " + info.getInfoValueColor().getValue());
        }
        List<Info> configInfo = detail.getConfigMetric().getValue().getInfo();
        System.out.println("configInfo =======================================================");
        for (Info info : configInfo) {
            System.out.println("infoId: " + info.getInfoId().getValue()
                    + ", infoName: " + info.getInfoName().getValue()
                    + ", infoValue: " + info.getInfoValue().getValue()
                    + ", infoValueColor: " + info.getInfoValueColor().getValue());
        }
        List<Info> infoMetric = detail.getInfoMetric().getValue().getInfo();
        System.out.println("infoMetric =======================================================");
        for (Info info : infoMetric) {
            System.out.println("infoId: " + info.getInfoId().getValue()
                    + ", infoName: " + info.getInfoName().getValue()
                    + ", infoValue: " + info.getInfoValue().getValue()
                    + ", infoValueColor: " + info.getInfoValueColor().getValue());
        }
        List<Info> performMetric = detail.getPerformMetric().getValue().getInfo();
        System.out.println("performMetric =======================================================");
        for (Info info : performMetric) {
            System.out.println("infoId: " + info.getInfoId().getValue()
                    + ", infoName: " + info.getInfoName().getValue()
                    + ", infoValue: " + info.getInfoValue().getValue()
                    + ", infoValueColor: " + info.getInfoValueColor().getValue());
        }

        System.out.println("categoryId: " + detail.getInstanceCategoryId().getValue());
        System.out.println("categoryName: " + detail.getInstanceCategoryName().getValue());
        System.out.println("instanceId: " + detail.getInstanceId().getValue());
        System.out.println("instanceName: " + detail.getInstanceName().getValue());
        System.out.println("instanceState: " + detail.getInstanceState().getValue());
        System.out.println("ip: " + detail.getIpAddress().getValue());
        System.out.println("isChild: " + detail.getIsChildInstance().getValue());
        System.out.println("loginResult: " + detail.getLoginResult().getValue());
        System.out.println("monitorState: " + detail.getMonitorState().getValue());
        System.out.println("parentName: " + detail.getParentInstanceName().getValue());



        return "aa";
    }

    @GetMapping("/discoveryRes")
    public Object discoveryRes(String token, String ip, String username, String password, int port) {
        ResourceInstanceServiceDevImpl resImpl = new ResourceInstanceServiceDevImpl();
        ResourceInstanceServiceDevImplPortType type = resImpl.getResourceInstanceServiceDevImplPort();

        String info = "{\"resourceType\":\"Linux.ssh\"," +
                "\"IP\":\"172.16.191.18\"," +
                "\"UserName\":\"root\"," +
                "\"Password\":" +
                "\"Passw0rd#!1\"," +
                "\"SSHPort\":\"22\"}";

        String result = type.discoveryRes(token, info);
        System.out.println("result: " + result);
        return result;
    }

    @PostMapping("/getMetrics")
    public Object getMetricsInfoByResourceId(@RequestParam("ids") List<String> ids) {
        ResourceInstanceServiceDevImpl resImpl = new ResourceInstanceServiceDevImpl();
        ResourceInstanceServiceDevImplPortType type = resImpl.getResourceInstanceServiceDevImplPort();

        ArrayOfString arrayOfString = new ArrayOfString();
        if (ids.size() > 0) {
            for (String id : ids) {
                arrayOfString.getString().add(id);
            }
        } else {
            System.out.println("id is null");
            return "null";
        }
        ArrayOfMetricInfoObj metricInfoObj = type.getMetricInfoByResourceId(arrayOfString);

        List<MetricInfoObj> objs = metricInfoObj.getMetricInfoObj();
        for (MetricInfoObj m : objs) {
            System.out.println("=============================> ");
            System.out.println("metricId: " + m.getMetricId().getValue());
            System.out.println("metricName: " + m.getMetricName().getValue());
            System.out.println("metricUnit: " + m.getMetricUnit().getValue());
            System.out.println("resourceId: " + m.getResourceId().getValue());
        }

        return "aaa";
    }


    @GetMapping("/dis")
    public String dis() {
        CentOsCollectUtil centOsCollectUtil = new CentOsCollectUtil();

        return centOsCollectUtil.dis("");
    }
}
