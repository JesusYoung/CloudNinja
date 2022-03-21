package cn.com.yangshj.monitor.entity;

import lombok.Data;
import lombok.ToString;

/**
 * CPU信息元数据
 *
 * Create by yangshijie on 3/21/22
 */
@Data
@ToString
public class CpuInfoMetadata {

    private String ip;
    private long userTime;
    private long niceTime;
    private long systemTime;
    private long idleTime;
    private long ioWaitTime;
    private long irqTime;
    private long softIrqTime;
    private long stealTime;
    private long guestTime;
    private long guestNiceTime;

    private long ctxtTime;
    private long bTime;
    private long processes;
    private long processRunning;
    private long processBlocked;
}
