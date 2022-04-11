package cn.com.yangshj.monitor.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import cn.com.yangshj.monitor.entity.MachineData;
import cn.com.yangshj.monitor.webservice.test.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.ibatis.annotations.Param;
import org.codehaus.jettison.json.JSONException;

/**
 * Linux-CentOS系统采集
 *
 * Create by yangshijie on 3/21/22
 */
public class CentOsCollectUtil {


    private static final String URL = "http://172.16.191.35/pureportal/webservices/rest/instance";

    public static List<String> getCpuRate(MachineData data, String command) {
        System.out.println("collect data Thread: " + Thread.currentThread().getName());
        String shell = String.format("%s", command);
//        String shell = String.format("%s", "cat /proc/stat");

        List<String> result = execCmd(data, shell);
//        for (String s : result) {
//            System.out.println("result===========> " + s);
//        }
//        String[] cpu = result.get(0).split("\\s+");
//        List<String> cpuList1 = Arrays.asList(cpu);
//        List<String> cpuList = new ArrayList<>(cpuList1);
//        for (String user : cpuList) {
//            System.out.println("=========> " + user);
//        }
//        cpuList.remove(0);

//        long allTime = 0L;
//        for (String s : cpuList) {
//            allTime += Long.parseLong(s);
//        }
//        System.out.println(String.format("CPU使用总时间 = %s;idle=%s", allTime, cpuList.get(3)));

//        long[] r = new long[2];
//        r[0] = allTime;
//        r[1] = Long.parseLong(cpuList.get(3));
//        return r;
        if (result == null) {
            return new ArrayList<>();
        } else {
            return result;
        }
    }

    private double getMemoryRate(MachineData data) {
        String shell = String.format("%s", "free -b");

        List<String> result = execCmd(data, shell);
//        for (String s : result) {
//            System.out.println("result===========> " + s);
//        }

        String[] aa = result.get(1).split("\\s+");
        Integer usedMemory = Integer.valueOf(aa[2]);
        Integer allMemory = Integer.valueOf(aa[1]);

        double f1 = new BigDecimal((float) usedMemory / allMemory).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue() * 100;
        System.out.println("memRate: " + f1);
        return f1;
    }

    private static List<String> execCmd(MachineData data, String command) {
//        Connection connection = new Connection("172.31.16.47", 22);
        Connection connection = new Connection(data.getIp(), data.getPort());
        Session ssh = createConnection(data, connection);
        if (ssh == null) {
            System.out.println("ssh is null");
            return new ArrayList<>();
        }

        List<String> resultList = new ArrayList<>();

        try {
            ssh.execCommand(command);
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream is = new StreamGobbler(ssh.getStdout());
        BufferedReader brs = new BufferedReader(new InputStreamReader(is));
        while (true) {
            String line = null;
            try {
                line = brs.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line == null) {
                break;
            }
//            System.out.println("out======>  " + line);
            resultList.add(line);
        }
        closeSsh(ssh);
        return resultList;
    }

    private static Session createConnection(MachineData data, Connection connection) {
        try {
            connection.connect();
//            connection.authenticateWithPassword("root", "passwd");
            connection.authenticateWithPassword(data.getUserName(), data.getPassword());
            return connection.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static void closeSsh(Session session) {
        if (session != null) {
            session.close();
        }
    }


    public static void main(String[] args) {

        String token = "GetToken-5DB7E1B9-43C9-4185-B62B-A8FAD04E11B6";

        CentOsCollectUtil util = new CentOsCollectUtil();
//        util.test(token);
        util.infoMsg(token);

//        util.aa();
    }


    public String test(String token) {
        ResourceInfo resourceInfo = new ResourceInfo();
//        resourceInfo.setResourceType("Linux.ssh");
//        resourceInfo.setIP("172.16.191.18");
//        resourceInfo.setUserName("root");
//        resourceInfo.setPassword("Passw0rd#!1");
//        resourceInfo.setSSHPort("22");

//        resourceInfo.setResourceType("Linux.ssh");
//        resourceInfo.setIP("172.30.126.179");
//        resourceInfo.setUserName("root");
//        resourceInfo.setPassword("123456");
//        resourceInfo.setSSHPort("22");

        resourceInfo.setResourceType("Windows.agent");
        resourceInfo.setIP("172.30.126.115");
        resourceInfo.setMRAMPort("7777");

        String info = JSON.toJSONString(resourceInfo);

        try {
            PostMethod postMethod = new PostMethod(URL + "/discovery");

            Header[] headers = postMethod.getRequestHeaders();
            if (headers != null && headers.length > 0) {
                for (Header header : headers) {
                    System.out.println("header: " + header.toString());
                    postMethod.removeRequestHeader(header);
                }
            } else {
                System.out.println("header is null");
            }

            postMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

            NameValuePair[] data = {
                    new NameValuePair("token", token),
                    new NameValuePair("info", info)
            };
            postMethod.setRequestBody(data);

            HttpClient httpClient = new HttpClient();
            int response = httpClient.executeMethod(postMethod);
            String result = postMethod.getResponseBodyAsString();

            System.out.println("info: " + info);

            System.out.println("response: " + response);
            System.out.println("result: " + result);

        } catch (Exception e) {
            System.out.println("ex: " + e.toString());
        }

        return "a";
    }

    public void infoMsg(String token) {
        try {
            PostMethod postMethod = new PostMethod(URL + "/detail");

            Header[] headers = postMethod.getRequestHeaders();
            if (headers != null && headers.length > 0) {
                for (Header header : headers) {
                    System.out.println("header: " + header.toString());
                    postMethod.removeRequestHeader(header);
                }
            } else {
                System.out.println("header is null");
            }

            postMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

            NameValuePair[] data = {
                    new NameValuePair("token", token),
                    new NameValuePair("instanceId", "11240")
            };
            postMethod.setRequestBody(data);

            HttpClient httpClient = new HttpClient();
            int response = httpClient.executeMethod(postMethod);
            String result = postMethod.getResponseBodyAsString();

            System.out.println("response: " + response);
            System.out.println("result: " + result);


            JSONObject json = JSONObject.parseObject(result);
            JSONObject data1 = json.getJSONObject("data");
            ResourceInstanceDetail detail = JSONObject.toJavaObject(data1, ResourceInstanceDetail.class);
            System.out.println("detail: \n" + detail.toString());

        } catch (Exception e) {
            System.out.println("ex: " + e.toString());
        }
    }

    public String getToken() {
        String url = "http://172.16.191.35/pureportal/webservices/rest/userLogin/token";
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Content-Type", "application/x-www-form-urlencoded");
        Map<String, Object> param = new HashMap<>();
        param.put("userName", "admin");
        param.put("userPwd", "e10adc3949ba59abbe56e057f20f883e");
        String token =  HttpClientUtil.get(url, headerMap, param);
        System.out.println("token: " + token);


        Result<LoginResult> result = (Result<LoginResult>) JSON.parse(token);

        System.out.println("aa: " + result.toString());
        return token;
    }

    public String dis(String token2) {
        String token = "GetToken-108A0847-05CA-1D89-A341-A79C6A9AC2A2";

        ResourceInfo resourceInfo = new ResourceInfo();
        resourceInfo.setResourceType("Linux.ssh");
        resourceInfo.setIP("172.30.126.179");
        resourceInfo.setUserName("root");
        resourceInfo.setPassword("123456");
        resourceInfo.setSSHPort("22");

        String info2 = JSON.toJSONString(resourceInfo);

        System.out.println("json: " + info2);

        ParamInfo paramInfo = new ParamInfo();
        paramInfo.setInfo(resourceInfo);
        paramInfo.setToken(token);

        String info = JSON.toJSONString(resourceInfo);
        String pa = JSON.toJSONString(paramInfo);

        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("Content-Type", "application/x-www-form-urlencoded");

        Map<String, Object> param = new HashMap<>();
        param.put("token", token);
        param.put("info", info);





//        return HttpClientUtil.post(URL, headerMap, param);
//        return HttpClientUtil.post(URL, headerMap, pa);

//        return HttpClientUtil.post(URL, param);
//        return HttpClientUtil.post(URL, pa);

        return "aa";
    }

    public void  aa() {

        String str = "{\"result\":0,\"data\":{\"actionList\":[],\"availMetric\":[{\"infoId\":\"LinuxHostAvailability_telnetadv\",\"infoName\":\"主机在线可用性\",\"infoValue\":\"1\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"today_avail\",\"infoName\":\"\",\"infoValue\":\"100\",\"infoValueColor\":\"\"},{\"infoId\":\"yesterday_avail\",\"infoName\":\"\",\"infoValue\":\"-\",\"infoValueColor\":\"\"},{\"infoId\":\"week_avail\",\"infoName\":\"\",\"infoValue\":\"100\",\"infoValueColor\":\"\"},{\"infoId\":\"month_avail\",\"infoName\":\"\",\"infoValue\":\"100\",\"infoValueColor\":\"\"},{\"infoId\":\"year_avail\",\"infoName\":\"\",\"infoValue\":\"100\",\"infoValueColor\":\"\"}],\"baseInfo\":[{\"infoId\":\"detail.info.restype\",\"infoName\":\"资源类型\",\"infoValue\":\"Linux\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.domain\",\"infoName\":\"所属域\",\"infoValue\":\"集团\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.dms\",\"infoName\":\"所属DMS\",\"infoValue\":\"dms\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.strategy\",\"infoName\":\"使用的策略\",\"infoValue\":\"默认策略Linux OS (Adv)(Telnet/SSH)\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.ip\",\"infoName\":\"IP地址\",\"infoValue\":\"172.30.126.179\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.mac\",\"infoName\":\"MAC地址\",\"infoValue\":\"00:50:56:b9:39:56\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.os\",\"infoName\":\"操作系统\",\"infoValue\":\"CentOS Linux release 7.6.1810 (Core)\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.runningtime\",\"infoName\":\"连续运行\",\"infoValue\":\"10d18h52m0s\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.usability\",\"infoName\":\"可用性统计\",\"infoValue\":\"最近7天100%\",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.explainhost\",\"infoName\":\"主机说明\",\"infoValue\":\"Linux yangshijie 3.10.0-957.el7.x86_64 \",\"infoValueColor\":\"\"},{\"infoId\":\"detail.info.remark\",\"infoName\":\"备注\",\"infoValue\":\"-\",\"infoValueColor\":\"\"}],\"componentType\":\"\",\"configMetric\":[{\"infoId\":\"LinuxNumberOfCpu_telnetadv\",\"infoName\":\"逻辑CPU个数\",\"infoValue\":\"1\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxNumberOfPhysicalCpu_telnetadv\",\"infoName\":\"物理CPU个数\",\"infoValue\":\"1\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxHostTotalMemSize_telnetadv\",\"infoName\":\"内存总容量\",\"infoValue\":\"1838.50MB\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxNumberOfHardDisk_telnetadv\",\"infoName\":\"硬盘个数\",\"infoValue\":\"1\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxTotalHardDiskSpace_telnetadv\",\"infoName\":\"硬盘总容量\",\"infoValue\":\"30GB\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxNumberOfNIC_telnetadv\",\"infoName\":\"网络接口个数\",\"infoValue\":\"1\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"detail.info.ip\",\"infoName\":\"IP地址\",\"infoValue\":\"172.30.126.179\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxNumberOfFileSystem_telnetadv\",\"infoName\":\"分区个数\",\"infoValue\":\"7\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxHostTotalPagingSpaceSize_telnetadv\",\"infoName\":\"Swap Space总大小\",\"infoValue\":\"2048MB\",\"infoValueColor\":\"GREEN\"}],\"infoMetric\":[{\"infoId\":\"LinuxSystemUptime_telnetadv\",\"infoName\":\"连续运行时间\",\"infoValue\":\"10d18h52m0s\",\"infoValueColor\":\"\"},{\"infoId\":\"LinuxSystemInfo_telnetadv\",\"infoName\":\"主机说明\",\"infoValue\":\"Linux yangshijie 3.10.0-957.el7.x86_64 \",\"infoValueColor\":\"\"},{\"infoId\":\"LinuxOS_telnetadv\",\"infoName\":\"主机操作系统\",\"infoValue\":\"CentOS Linux release 7.6.1810 (Core)\",\"infoValueColor\":\"\"},{\"infoId\":\"LinuxNumberOfProcess_telnetadv\",\"infoName\":\"进程数\",\"infoValue\":\"96\",\"infoValueColor\":\"\"},{\"infoId\":\"LinuxHostTotalAllFSSpace_telnetadv\",\"infoName\":\"分区总容量\",\"infoValue\":\"31.73GB\",\"infoValueColor\":\"\"},{\"infoId\":\"Timezone_Linux_telnetadv\",\"infoName\":\"时钟时区\",\"infoValue\":\"\",\"infoValueColor\":\"\"}],\"instanceCategoryId\":\"\",\"instanceCategoryName\":\"Linux\",\"instanceId\":\"10507\",\"instanceName\":\"yangshijie\",\"instanceState\":\"GREENRED\",\"ipAddress\":\"172.30.126.179\",\"isChildInstance\":\"false\",\"localtion\":\"true\",\"loginResult\":\"true\",\"maintenancePeople\":\"\",\"monitorState\":\"monitor\",\"parentInstanceName\":\"\",\"performMetric\":[{\"infoId\":\"LinuxHostAvgCPURate_telnetadv\",\"infoName\":\"CPU平均利用率\",\"infoValue\":\"0%\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxHostAvgMemUtilization_telnetadv\",\"infoName\":\"内存利用率\",\"infoValue\":\"11.97%\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxHostAvgPageIn_telnetadv\",\"infoName\":\"内存页面调进速率\",\"infoValue\":\"\",\"infoValueColor\":\"WHITE\"},{\"infoId\":\"LinuxHostAvgPageOut_telnetadv\",\"infoName\":\"内存页面调出速率\",\"infoValue\":\"\",\"infoValueColor\":\"WHITE\"},{\"infoId\":\"LinuxHostSwapSpaceUtilization_telnetadv\",\"infoName\":\"Swap Space利用率\",\"infoValue\":\"0%\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxHostAvgHDWriteOpration_telnetadv\",\"infoName\":\"硬盘平均写操作速率\",\"infoValue\":\"\",\"infoValueColor\":\"WHITE\"},{\"infoId\":\"LinuxHostAvgHDReadOpration_telnetadv\",\"infoName\":\"硬盘平均读操作速率\",\"infoValue\":\"\",\"infoValueColor\":\"WHITE\"},{\"infoId\":\"LinuxHostAvgHDWrite_telnetadv\",\"infoName\":\"硬盘平均写速率\",\"infoValue\":\"\",\"infoValueColor\":\"GRAY\"},{\"infoId\":\"LinuxHostAvgHDRead_telnetadv\",\"infoName\":\"硬盘平均读速率\",\"infoValue\":\"\",\"infoValueColor\":\"GRAY\"},{\"infoId\":\"LinuxHostDelayedPing_telnetadv\",\"infoName\":\"Ping 时延\",\"infoValue\":\"0毫秒\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxNumberOfProcessMonitorUser_telnetadv\",\"infoName\":\"监控用户进程数\",\"infoValue\":\"95\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxNumberOfDeadProcessMonitorUser_telnetadv\",\"infoName\":\"监控用户僵死进程数\",\"infoValue\":\"0\",\"infoValueColor\":\"GREEN\"},{\"infoId\":\"LinuxNumberOfLinkMonitorUser_telnetadv\",\"infoName\":\"终端用户登陆的连接总数\",\"infoValue\":\"5\",\"infoValueColor\":\"GREEN\"}],\"serviceList\":[],\"telPhone\":\"\"}}\n";

        JSONObject json = JSONObject.parseObject(str);

        JSONObject data = json.getJSONObject("data");

        System.out.println("data: \n" + data.toJSONString());


        ResourceInstanceDetail detail = JSONObject.toJavaObject(data, ResourceInstanceDetail.class);


        System.out.println("detail: \n" + detail.toString());
    }
}
