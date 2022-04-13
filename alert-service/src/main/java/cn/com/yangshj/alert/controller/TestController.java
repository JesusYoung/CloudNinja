package cn.com.yangshj.alert.controller;

import cn.com.yangshj.alert.config.OpsLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by yangshj on 4/12/22
 */
@RestController
@RequestMapping("/api/v1/alert")
public class TestController {


//    @OpsLog("testAlert")
    @GetMapping("/test")
    public String test(String str, String oa) {

        return "aaa";
    }
}
