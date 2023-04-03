package cn.com.yangshj.oauth.controller;

import cn.com.yangshj.base.entity.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author yangshj
 * @since 2023/4/3 16:54
 */
@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping("/getA")
    public CommonResult<String> testAAA() {
        return CommonResult.success("aaaaa");
    }
}
