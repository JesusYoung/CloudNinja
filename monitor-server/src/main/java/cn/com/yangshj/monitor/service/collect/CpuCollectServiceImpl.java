package cn.com.yangshj.monitor.service.collect;

import java.util.Date;

import cn.com.yangshj.monitor.entity.MachineData;
import cn.com.yangshj.monitor.task.TaskLinuxCpuCollectJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Service;

/**
 * Create by yangshijie on 3/21/22
 */
@Service
public class CpuCollectServiceImpl implements CpuCollectService {

    @Override
    public void startCpuCollect(MachineData data, String command) {
        try {

            JobDetail jobDetail = JobBuilder.newJob(TaskLinuxCpuCollectJob.class)
                    .withIdentity("cpuCollect", "cpuGroup")
                    .build();
            SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).repeatForever();

            Date startTime = new Date();
            // 指定3秒后执行
            startTime.setTime(startTime.getTime() + 3000);
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("cpuCollectTrigger", "cpuGroup2")
//                    .startNow()
                    .startAt(startTime)
                    .withSchedule(scheduleBuilder)
                    .build();

            SchedulerFactory sfact = new StdSchedulerFactory();
            Scheduler scheduler = sfact.getScheduler();
            // 绑定任务和触发器
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
        } catch (SchedulerException e) {
            System.out.println("error.....e: " + e.toString());
            e.printStackTrace();
        }
    }
}
