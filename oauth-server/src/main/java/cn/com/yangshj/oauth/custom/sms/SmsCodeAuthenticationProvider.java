package cn.com.yangshj.oauth.custom.sms;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

import cn.com.yangshj.oauth.constant.OAuthConstant;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.ObjectUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * 短信登陆鉴权 Provider，要求实现 AuthenticationProvider 接口
 *
 * @author yangshj
 * @since 2023/4/19 15:59
 */
@Slf4j
@Setter
public class SmsCodeAuthenticationProvider implements AuthenticationProvider {

    @Resource
    private SmsUserDetailsServiceImpl smsUserDetailsService;
    private RedisTemplate<String, String> redisTemplate;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        SmsCodeAuthenticationToken token = (SmsCodeAuthenticationToken) authentication;

        String phoneNumber = (String) authentication.getPrincipal();
        this.checkSmsCode(phoneNumber);

        // 获取用户信息
        UserDetails userDetails = this.smsUserDetailsService.loadUserByUsername(phoneNumber);
        if (ObjectUtils.isEmpty(userDetails)) {
            throw new InternalAuthenticationServiceException("认证失败: 没有找到用户 " + token.getPrincipal());
        }

        // 此时鉴权成功后，应当重新 new 一个拥有鉴权的 authenticationResult 返回
        SmsCodeAuthenticationToken authenticationToken = new SmsCodeAuthenticationToken(userDetails,
                userDetails.getAuthorities());
        authenticationToken.setDetails(token.getDetails());
        return authenticationToken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        // 判断 authentication 是不是 SmsCodeAuthenticationToken 的子类或子接口
        return SmsCodeAuthenticationToken.class.isAssignableFrom(authentication);
    }

    private void checkSmsCode(String phoneNumber) {
        HttpServletRequest request = ((ServletRequestAttributes) Objects
                .requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();

        // 请求参数中的短信验证码
        String inputCode = request.getParameter(OAuthConstant.AUTH_PARAMETER_VALUE_SMS);

        // 这里的验证码放在静态 Map 里，这里拿出来跟用户输入的做对比
//        String smsCode = OAuthConstant.smsCode.get(phoneNumber);

        // 验证码存放在Redis中
        String smsCode = this.redisTemplate.opsForValue().get(phoneNumber + "_code");
        if (smsCode == null) {
            throw new BadCredentialsException("未检测到申请验证码");
        }
        if (!inputCode.equals(smsCode)) {
            throw new BadCredentialsException("验证码错误");
        }

//        String applyMobile = (String) smsCode.get("mobile");
//        int code = (int) smsCode.get("code");
//
//        if (!applyMobile.equals(phoneNumber)) {
//            throw new BadCredentialsException("申请的手机号码与登录手机号码不一致");
//        }
//        if (code != Integer.parseInt(inputCode)) {
//            throw new BadCredentialsException("验证码错误");
//        }
    }
}
