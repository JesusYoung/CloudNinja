package cn.com.yangshj.oauth.service;

/**
 * 验证码接口
 *
 * @author yangshj
 * @since 2023/4/19 15:32
 */
public interface IValidateCodeService {

    void getSmsVerificationCode(String phoneNumber);
}
