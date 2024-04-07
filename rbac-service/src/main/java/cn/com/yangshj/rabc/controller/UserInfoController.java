package cn.com.yangshj.rabc.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import cn.com.yangshj.base.entity.AuthUser;
import cn.com.yangshj.base.entity.CommonResult;
import cn.com.yangshj.rabc.dto.UserInfoDto;
import cn.com.yangshj.rabc.service.IUserInfoService;
import cn.com.yangshj.rabc.vo.UserInfoVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 用户信息接口
 *
 * @author yangshj
 * @since 2023/3/24 14:43
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserInfoController {

    @Resource
    private IUserInfoService userInfoService;


    @ApiOperation("获取用户信息")
    @GetMapping("/{id}")
    public CommonResult<UserInfoDto> findById(@ApiIgnore @PathVariable String id) {
        return CommonResult.success(this.userInfoService.findById(id));
    }

    @ApiOperation("新增用户")
    @PostMapping
    public CommonResult<UserInfoDto> add(@RequestBody @Valid UserInfoVo userVo) {
        return CommonResult.success(this.userInfoService.add(userVo));
    }

    @ApiOperation("根据用户名获取用户信息")
    @GetMapping("/loadByUsername")
    public CommonResult<AuthUser> loadByUsername(String username) {
        return CommonResult.success(this.userInfoService.loadByUsername(username));
    }

    @ApiOperation("根据手机号获取用户信息")
    @GetMapping("/loadByPhoneNumber")
    public CommonResult<AuthUser> loadByPhoneNumber(String phoneNumber) {
        return CommonResult.success(this.userInfoService.loadByPhoneNumber(phoneNumber));
    }
}
