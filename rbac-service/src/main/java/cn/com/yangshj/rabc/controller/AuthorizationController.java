package cn.com.yangshj.rabc.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import cn.com.yangshj.base.dto.OAuth2AccessTokenDTO;
import cn.com.yangshj.base.dto.OAuth2TokenDTO;
import cn.com.yangshj.base.entity.CommonResult;
import cn.com.yangshj.rabc.feign.OAuthServiceClient;
import cn.com.yangshj.rabc.vo.LoginVO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户认证控制器
 *
 * @author yangshj
 * @since 2023/4/4 15:17
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
public class AuthorizationController {

    @Resource
    private OAuthServiceClient oAuthServiceClient;

    @ApiOperation("用户名密码方式登录")
    @PostMapping("/login")
    public CommonResult<OAuth2TokenDTO> login(@Valid @RequestBody LoginVO vo) {
        log.info("Invoke[grant_type=password]");
        String basicClient = "cloud_ninja_client:cloud_ninja";
        String clientCredentials = "Basic ".concat(new String(Base64.getEncoder().encode(basicClient.getBytes(
                StandardCharsets.UTF_8))));
        OAuth2AccessTokenDTO auth2AccessTokenDTO = this.oAuthServiceClient.login("password", vo.getUsername(),
                vo.getPassword(), "all", clientCredentials);
        return CommonResult.success(this.convertToAuthTokenDTO(auth2AccessTokenDTO));
    }

    /**
     * 转换AuthToken
     *
     * @param auth2AccessTokenDTO 认证服务Token
     * @return 全局Token
     */
    private OAuth2TokenDTO convertToAuthTokenDTO(OAuth2AccessTokenDTO auth2AccessTokenDTO) {
        OAuth2TokenDTO auth2TokenDTO = new OAuth2TokenDTO();
        auth2TokenDTO.setAccessToken(auth2AccessTokenDTO.getAccess_token());
        auth2TokenDTO.setRefreshToken(auth2AccessTokenDTO.getRefresh_token());
        auth2TokenDTO.setTokenType(auth2AccessTokenDTO.getToken_type());
        auth2TokenDTO.setExpiresIn(auth2AccessTokenDTO.getExpires_in());
        auth2TokenDTO.setScope(auth2AccessTokenDTO.getScope());
        auth2TokenDTO.setId(auth2AccessTokenDTO.getId());
        auth2TokenDTO.setUserId(auth2AccessTokenDTO.getUserId());
        auth2TokenDTO.setUsername(auth2AccessTokenDTO.getUsername());
        auth2TokenDTO.setEmail(auth2AccessTokenDTO.getEmail());
        auth2TokenDTO.setJti(auth2AccessTokenDTO.getJti());
        return auth2TokenDTO;
    }
}
