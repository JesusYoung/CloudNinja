package cn.com.yangshj.monitor.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.com.yangshj.monitor.entity.CpuInfoMetadata;

/**
 * 数据处理
 *
 * Create by yangshijie on 3/21/22
 */
public class DataProcessUtil {




    public static CpuInfoMetadata processCpuMetadata(List<String> cpuInfo, String ip) {
        System.out.println("process data Thread: " + Thread.currentThread().getName());
        if (cpuInfo.size() <= 0) {
            return null;
        }
        CpuInfoMetadata metadata = new CpuInfoMetadata();
        metadata.setIp(ip);

        String[] cpu = cpuInfo.get(0).split("\\s+");
        List<String> cpuList1 = Arrays.asList(cpu);
        List<String> cpuList = new ArrayList<>(cpuList1);
        cpuList.remove(0);
        metadata.setUserTime(Long.valueOf(cpuList.get(0)));
        metadata.setNiceTime(Long.valueOf(cpuList.get(1)));
        metadata.setSystemTime(Long.valueOf(cpuList.get(2)));
        metadata.setIdleTime(Long.valueOf(cpuList.get(3)));
        metadata.setIoWaitTime(Long.valueOf(cpuList.get(4)));
        metadata.setIrqTime(Long.valueOf(cpuList.get(5)));
        metadata.setSoftIrqTime(Long.valueOf(cpuList.get(6)));
        metadata.setStealTime(Long.valueOf(cpuList.get(7)));
        metadata.setGuestTime(Long.valueOf(cpuList.get(8)));
        metadata.setGuestNiceTime(Long.valueOf(cpuList.get(9)));

        for (String result : cpuInfo) {
            if (result.startsWith("ctxt")) {
                String[] ctxt = result.split("\\s+");
                metadata.setCtxtTime(Long.valueOf(ctxt[1]));
            }
            if (result.startsWith("btime")) {
                String[] btime = result.split("\\s+");
                metadata.setBTime(Long.valueOf(btime[1]));
            }
            if (result.startsWith("processes")) {
                String[] process = result.split("\\s+");
                metadata.setProcesses(Long.valueOf(process[1]));
            }
            if (result.startsWith("procs_running")) {
                String[] proc_running = result.split("\\s+");
                metadata.setProcessRunning(Long.valueOf(proc_running[1]));
            }
            if (result.startsWith("procs_blocked")) {
                String[] procs_blocked = result.split("\\s+");
                metadata.setProcessBlocked(Long.valueOf(procs_blocked[1]));
            }
        }
        return metadata;
    }
}
