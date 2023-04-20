package cn.com.yangshj.oauth.custom.sms;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import cn.com.yangshj.oauth.constant.OAuthConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * 短信验证码认证过滤器
 *
 * @author yangshj
 * @since 2023/4/19 15:41
 */
@Slf4j
public class SmsCodeAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    /**
     * 是否仅 POST 方式
     */
    private boolean postOnly = true;

    public SmsCodeAuthenticationFilter() {
        super(new AntPathRequestMatcher(OAuthConstant.CUSTOM_AUTH_TYPE_PATH_SMS, HttpMethod.POST.name()));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {
        if (postOnly && !HttpMethod.POST.name().equalsIgnoreCase(request.getMethod())) {
            throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
        }
        String phoneNumber = this.obtainPhoneNumber(request);
        phoneNumber = phoneNumber == null ? "" : phoneNumber.trim();

        SmsCodeAuthenticationToken smsCodeAuthenticationToken = new SmsCodeAuthenticationToken(phoneNumber);
        this.setDetails(request, smsCodeAuthenticationToken);

        // 认证管理器对 SmsAuthenticationToken 进行认证
        return this.getAuthenticationManager().authenticate(smsCodeAuthenticationToken);
    }

    private String obtainPhoneNumber(HttpServletRequest request) {
        return request.getParameter(OAuthConstant.AUTH_PARAMETER_KEY_SMS);
    }

    private void setDetails(HttpServletRequest request, SmsCodeAuthenticationToken authRequest) {
        authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }
}
