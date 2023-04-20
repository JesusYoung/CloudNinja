package cn.com.yangshj.oauth.service;

import cn.com.yangshj.base.entity.AuthUser;

/**
 * 用户信息接口
 *
 * @author yangshj
 * @since 2023/3/24 14:25
 */
public interface IUserService {

    AuthUser getAuthUserDetailByName(String userName);

    AuthUser getAuthUserDetailByPhoneNumber(String phoneNumber);
}
