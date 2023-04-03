package cn.com.yangshj.oauth.controller;

/**
 * 客户端接口
 *
 * @author yangshj
 * @since 2023/3/30 15:37
 */

import javax.annotation.Resource;

import java.util.List;

import cn.com.yangshj.base.entity.CommonResult;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Resource
    JdbcClientDetailsService jdbcClientDetailsService;


    @GetMapping("/list")
    public CommonResult<List<ClientDetails>> list() {
        CommonResult<List<ClientDetails>> result = CommonResult.success();
        List<ClientDetails> clientDetails = jdbcClientDetailsService.listClientDetails();
        result.setData(clientDetails);
        return result;
    }

    // TODO 403
    @PostMapping("/add")
    public CommonResult<Void> create(@RequestBody BaseClientDetails baseClientDetails) {
        jdbcClientDetailsService.addClientDetails(baseClientDetails);
        return CommonResult.success();
    }
}
