package cn.com.yangshj.oauth.feign;

import cn.com.yangshj.base.entity.AuthUser;
import cn.com.yangshj.base.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Rbac接口服务
 *
 * @author yangshj
 * @since 2023/3/31 13:56
 */
@FeignClient(value = "rbac-service")
public interface RbacServiceClient {

    @GetMapping("/api/v1/user/loadByUsername")
    CommonResult<AuthUser> loadByUsername(@RequestParam String username);

    @GetMapping("/api/v1/user/loadByPhoneNumber")
    CommonResult<AuthUser> loadByPhoneNumber(@RequestParam String phoneNumber);
}
