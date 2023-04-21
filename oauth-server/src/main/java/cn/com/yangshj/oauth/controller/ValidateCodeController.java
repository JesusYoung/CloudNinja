package cn.com.yangshj.oauth.controller;

import javax.annotation.Resource;

import cn.com.yangshj.base.entity.CommonResult;
import cn.com.yangshj.oauth.service.IValidateCodeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 验证码
 *
 * @author yangshj
 * @since 2023/4/19 15:31
 */
@RestController
@RequestMapping("/validate")
public class ValidateCodeController {

    @Resource
    private IValidateCodeService validateCodeService;


    @PostMapping("/sms")
    public CommonResult<Void> getSmsVerificationCode(String phoneNumber) {
        this.validateCodeService.getSmsVerificationCode(phoneNumber);
        return CommonResult.success();
    }
}
