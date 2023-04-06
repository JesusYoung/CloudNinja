package cn.com.yangshj.rabc.service;

import cn.com.yangshj.base.entity.AuthUser;
import cn.com.yangshj.rabc.dto.UserInfoDto;
import cn.com.yangshj.rabc.entity.UserInfo;
import cn.com.yangshj.rabc.vo.UserInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 *
 * @author yangshj
 * @since 2023/3/24 14:55
 */
public interface IUserInfoService extends IService<UserInfo> {

    UserInfoDto findById(String id);

    UserInfoDto add(UserInfoVo vo);

    AuthUser loadByUsername(String name);
}
