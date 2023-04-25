package cn.com.yangshj.oauth.custom.sms;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;

import cn.com.yangshj.oauth.constant.OAuthConstant;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.UnapprovedClientAuthenticationException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.TokenRequest;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * 短信认证成功处理器
 * 认证成功后创建令牌
 *
 * @author yangshj
 * @since 2023/4/19 16:15
 */
@Slf4j
@Component
public class SmsCodeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Resource(name = "jdbcClientDetailsService")
    private JdbcClientDetailsService jdbcClientDetailsService;
    @Resource
    private ObjectMapper objectMapper;
    @Resource
    private PasswordEncoder passwordEncoder;
    @Resource
    private AuthorizationServerTokenServices tokenServices;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        // 获取客户端信息
        String header = request.getHeader("Authorization");
        if (header == null || !header.toLowerCase().startsWith("basic ")) {
            throw new UnapprovedClientAuthenticationException("没有找到Header中的客户端信息");
        }

        BaseClientDetails baseClientDetails = obtainClient(header);

        // 使用Spring Security oauth2 默认实现
        // 查询客户端信息
        ClientDetails clientDetails = jdbcClientDetailsService.loadClientByClientId(baseClientDetails.getClientId());
        if (clientDetails == null) {
            log.error("没有找到 client_id = {}", baseClientDetails.getClientId());
            throw new UnapprovedClientAuthenticationException("客户端信息不存在：" + baseClientDetails.getClientId());
        } else if (!passwordEncoder.matches(baseClientDetails.getClientSecret(), clientDetails.getClientSecret())) {
            log.error("Client密码不正确, client_id = {}", clientDetails.getClientId());
            throw new UnapprovedClientAuthenticationException("客户端密钥不匹配：" + baseClientDetails.getClientSecret());
        }

        // 构建令牌请求
        TokenRequest tokenRequest = new TokenRequest(new HashMap<>(0), baseClientDetails.getClientId(),
                clientDetails.getScope(), OAuthConstant.CUSTOM_AUTH_TYPE_SMS_CODE);
        // 构建OAuth2令牌请求
        OAuth2Request oAuth2Request = tokenRequest.createOAuth2Request(clientDetails);
        // 构建OAuth2身份认证令牌
        OAuth2Authentication oAuth2Authentication = new OAuth2Authentication(oAuth2Request, authentication);
        // 构建OAuth2访问令牌
        OAuth2AccessToken oAuth2AccessToken = this.tokenServices.createAccessToken(oAuth2Authentication);

        log.info("认证成功, client_id = {}", clientDetails.getClientId());
        // 返回令牌信息
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(objectMapper.writeValueAsString(oAuth2AccessToken));
    }

    /**
     * 解密并拆分请求头中的客户端信息
     * 格式：client_id:client_secret
     *
     * @param header 请求头
     * @return 客户端信息
     */
    private BaseClientDetails obtainClient(String header) {
        byte[] headerBase64 = header.substring(6).getBytes(StandardCharsets.UTF_8);

        byte[] clientDecode;
        try {
            clientDecode = Base64.getDecoder().decode(headerBase64);
        } catch (IllegalArgumentException e) {
            log.error("Base64解码失败");
            throw new BadCredentialsException("Failed to decode basic authentication token");
        }
        String token = new String(clientDecode, StandardCharsets.UTF_8);
        String[] arr = token.split(":");
        if (arr.length != 2) {
            throw new BadCredentialsException("Invalid basic authentication token");
        }
        BaseClientDetails baseClientDetails = new BaseClientDetails();
        baseClientDetails.setClientId(arr[0]);
        baseClientDetails.setClientSecret(arr[1]);
        return baseClientDetails;
    }
}
