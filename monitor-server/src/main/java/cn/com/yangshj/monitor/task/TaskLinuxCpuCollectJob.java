package cn.com.yangshj.monitor.task;

import java.util.List;

import cn.com.yangshj.monitor.contants.CentOsCommand;
import cn.com.yangshj.monitor.contants.CommonContants;
import cn.com.yangshj.monitor.entity.CpuInfoMetadata;
import cn.com.yangshj.monitor.entity.MachineData;
import cn.com.yangshj.monitor.utils.CentOsCollectUtil;
import cn.com.yangshj.monitor.utils.DataProcessUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Create by yangshijie on 3/21/22
 */
public class TaskLinuxCpuCollectJob implements Job {


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        MachineData machineData = new MachineData();
        machineData.setIp(CommonContants.LINUX_CENTOS_IP);
        machineData.setPort(CommonContants.LINUX_CENTOS_PORT);
        machineData.setUserName(CommonContants.USER_NAME);
        machineData.setPassword(CommonContants.PASSWORD);
        List<String> result = CentOsCollectUtil.getCpuRate(machineData, CentOsCommand.LINUX_CPU_RATE);
        CpuInfoMetadata metadata = DataProcessUtil.processCpuMetadata(result, machineData.getIp());
        System.out.println("execute task Thread: " + Thread.currentThread().getName());
        if (metadata != null) {
            System.out.println("process metadata: " + metadata.toString());
        } else {
            System.out.println("process metadata is null;");
        }
    }
}
