package cn.com.yangshj.monitor.controller;

import javax.annotation.Resource;

import cn.com.yangshj.monitor.entity.MachineData;
import cn.com.yangshj.monitor.service.collect.CpuCollectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by yangshijie on 3/21/22
 */
@RestController
@RequestMapping("/api/v1/cpu")
public class CpuCollectController {

    @Resource
    private CpuCollectService cpuCollectService;

    @PostMapping("/start")
    public String startCpuCollect() {
        this.cpuCollectService.startCpuCollect(new MachineData(), "aa");

        return "start";
    }
}
