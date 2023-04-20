package cn.com.yangshj.oauth.service.impl;

import javax.annotation.Resource;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import cn.com.yangshj.base.api.ResultCode;
import cn.com.yangshj.base.entity.AuthUser;
import cn.com.yangshj.base.entity.CommonResult;
import cn.com.yangshj.oauth.feign.RbacServiceClient;
import cn.com.yangshj.oauth.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * 用户信息
 *
 * @author yangshj
 * @since 2023/3/24 14:27
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private RbacServiceClient rbacServiceClient;


    @Override
    public AuthUser getAuthUserDetailByName(String userName) {
        CommonResult<AuthUser> commonResult = this.rbacServiceClient.loadByUsername(userName);
        if (commonResult.getCode() != ResultCode.SUCCESS.getCode()) {
            throw new UsernameNotFoundException(commonResult.getMessage());
        }
        AuthUser authUser = commonResult.getData();
        if (ObjectUtils.isEmpty(authUser) || ObjectUtils.isEmpty(authUser.getId())) {
            throw new UsernameNotFoundException("用户名或密码错误!");
        }
        log.info("查询用户信息：" + authUser.toString());
        return authUser;
    }

    @Override
    public AuthUser getAuthUserDetailByPhoneNumber(String phoneNumber) {
        CommonResult<AuthUser> commonResult = this.rbacServiceClient.loadByPhoneNumber(phoneNumber);
        if (commonResult.getCode() != ResultCode.SUCCESS.getCode()) {
            throw new UsernameNotFoundException(commonResult.getMessage());
        }
        AuthUser authUser = commonResult.getData();
        if (ObjectUtils.isEmpty(authUser) || ObjectUtils.isEmpty(authUser.getId())) {
            throw new UsernameNotFoundException("手机号或验证码错误!");
        }
        log.info("查询用户信息：" + authUser.toString());
        return authUser;
    }


    public static void main(String[] args) {
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//
//        String aaa = "cloud_ninja";
//        String aaa1 = "manager-app:123456";
//        String ccc = "123456";
//
//        String bbb = encoder.encode(aaa);
//        String bbb1 = encoder.encode(aaa1);
//        String ccc1 = encoder.encode(ccc);
//
//        System.out.println("bbb: " + bbb);
//        System.out.println("bbb1: " + bbb1);
//        System.out.println("ccc: " + ccc1);
//
//
//        String au = "cloud_ninja_client:cloud_ninja";
//        String base64Au = new String(Base64.getEncoder().encode(au.getBytes(StandardCharsets.UTF_8)));
//        String sss = "Basic " + base64Au;
//
//        System.out.println("au: \n" + base64Au);
//        System.out.println("base64au: \n" + sss);
//
//
//        System.out.println("haha: " + encoder.encode(base64Au));
//        System.out.println("haha2: " + encoder.encode(sss));
//
//        PasswordEncoder noOpPasswordEncoder = NoOpPasswordEncoder.getInstance();
//        System.out.println("aaaaa: " + noOpPasswordEncoder.encode("123456"));
//
//
//        System.out.println("aa: " + encoder.encode("cloud_ninja"));

        String BEARER = "Bearer";
        String bearerStr = "Bearer asfaHISfaioaHIUHHdfioshHOSflknhofihai";

        String headerValue = bearerStr.substring(BEARER.length()).trim();
        System.out.println("headerValue: " + headerValue);

    }
}
