package cn.com.yangshj.oauth.service.impl;

import javax.annotation.Resource;

import java.util.concurrent.TimeUnit;

import cn.com.yangshj.oauth.service.IValidateCodeService;
import cn.com.yangshj.oauth.utils.VerificationCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 验证码接口实现
 *
 * @author yangshj
 * @since 2023/4/21 15:10
 */
@Slf4j
@Service
public class ValidateCodeServiceImpl implements IValidateCodeService {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    private static final long VERIFY_CODE_TIME = 5 * 60;

    @Override
    public void getSmsVerificationCode(String phoneNumber) {
        // TODO 校验手机号格式

        String verifyCode = VerificationCodeUtil.generateNumberVerifyCode();
        log.info("生成数字验证码： " + phoneNumber + "--" + verifyCode);

        this.redisTemplate.opsForValue().set(phoneNumber + "_code", verifyCode, VERIFY_CODE_TIME, TimeUnit.SECONDS);
        String aaa = this.redisTemplate.opsForValue().get(phoneNumber + "_code");
        log.info("aa: " + aaa);
        // TODO 发送验证码逻辑
    }
}
