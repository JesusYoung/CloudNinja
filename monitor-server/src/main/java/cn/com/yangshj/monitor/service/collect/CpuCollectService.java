package cn.com.yangshj.monitor.service.collect;

import cn.com.yangshj.monitor.entity.MachineData;

/**
 * Create by yangshijie on 3/21/22
 */
public interface CpuCollectService {


    void startCpuCollect(MachineData data, String command);
}
