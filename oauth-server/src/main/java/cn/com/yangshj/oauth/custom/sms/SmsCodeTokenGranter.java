package cn.com.yangshj.oauth.custom.sms;

import java.util.Map;

import cn.com.yangshj.oauth.constant.OAuthConstant;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2RequestFactory;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.token.AbstractTokenGranter;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.util.ObjectUtils;

/**
 * 短信验证码授权
 *
 * @author yangshj
 * @since 2023/4/19 17:18
 */
public class SmsCodeTokenGranter extends AbstractTokenGranter {

    private final SmsUserDetailsServiceImpl smsUserDetailsService;

    public SmsCodeTokenGranter(AuthorizationServerTokenServices tokenServices,
            ClientDetailsService clientDetailsService,
            SmsUserDetailsServiceImpl smsUserDetailsService,
            OAuth2RequestFactory requestFactory) {
        super(tokenServices, clientDetailsService, requestFactory, OAuthConstant.CUSTOM_AUTH_TYPE_SMS_CODE);
        this.smsUserDetailsService = smsUserDetailsService;
    }

    @Override
    protected OAuth2Authentication getOAuth2Authentication(ClientDetails client, TokenRequest tokenRequest) {
        Map<String, String> params = tokenRequest.getRequestParameters();
        String phoneNumber = params.getOrDefault(OAuthConstant.AUTH_PARAMETER_KEY_SMS, "");
        UserDetails userDetails = this.smsUserDetailsService.loadUserByUsername(phoneNumber);
        if (ObjectUtils.isEmpty(userDetails)) {
            throw new UsernameNotFoundException("没有找到用户：" + phoneNumber);
        }
        // 构建用户授权信息
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails.getUsername(),
                userDetails.getPassword(), userDetails.getAuthorities());
        return new OAuth2Authentication(tokenRequest.createOAuth2Request(client), authentication);
    }
}
