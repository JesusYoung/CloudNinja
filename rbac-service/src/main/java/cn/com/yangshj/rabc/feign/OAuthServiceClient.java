package cn.com.yangshj.rabc.feign;

import cn.com.yangshj.base.dto.OAuth2AccessTokenDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 认证授权服务接口
 *
 * @author yangshj
 * @since 2023/4/4 15:28
 */
@FeignClient(value = "oauth-server")
public interface OAuthServiceClient {

    @PostMapping("/oauth/token")
    OAuth2AccessTokenDTO login(@RequestParam("grant_type") String grantType,
                               @RequestParam("username") String username,
                               @RequestParam("password") String password,
                               @RequestParam("scope") String scope,
                               @RequestHeader("Authorization") String clientCredentials);
}
