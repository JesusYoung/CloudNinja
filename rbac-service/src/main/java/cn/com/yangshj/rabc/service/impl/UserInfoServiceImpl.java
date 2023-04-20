package cn.com.yangshj.rabc.service.impl;

import java.util.Date;

import cn.com.yangshj.base.api.ApiException;
import cn.com.yangshj.base.entity.AuthUser;
import cn.com.yangshj.rabc.dto.UserInfoDto;
import cn.com.yangshj.rabc.entity.UserInfo;
import cn.com.yangshj.rabc.mapper.UserInfoMapper;
import cn.com.yangshj.rabc.service.IUserInfoService;
import cn.com.yangshj.rabc.vo.UserInfoVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 *
 *
 * @author yangshj
 * @since 2023/3/24 14:57
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {


    @Override
    public UserInfoDto findById(String id) {
        UserInfo userInfo = getById(id);
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new ApiException("用户不存在");
        }
        return this.convertToDto(userInfo);
    }

    @Override
    public UserInfoDto add(UserInfoVo vo) {
        // TODO 校验手机号码、邮箱格式
        // TODO 校验手机号唯一

        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(vo, userInfo);
        userInfo.setId(IdWorker.getIdStr());
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userInfo.setPassword(passwordEncoder.encode(vo.getPassword()));
        userInfo.setStatus(1);
        userInfo.setCreateTime(new Date().getTime());
        save(userInfo);
        return this.convertToDto(userInfo);
    }

    @Override
    public AuthUser loadByUsername(String username) {
        AuthUser authUser = new AuthUser();

        UserInfo userQuery = new UserInfo();
        userQuery.setName(username);
        UserInfo userInfo = getOne(new QueryWrapper<>(userQuery));
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new ApiException("用户不存在");
        }
        BeanUtils.copyProperties(userInfo, authUser);
//        if (userDto.getRoleList() != null) {
//            authUser.setRoleList(userDto.getRoleList().stream()
//                    .map(r -> r.getId() + "_" + r.getName())
//                    .collect(Collectors.toList()));
//        }
        return authUser;
    }

    @Override
    public AuthUser loadByPhoneNumber(String phoneNumber) {
        AuthUser authUser = new AuthUser();

        UserInfo userQuery = new UserInfo();
        userQuery.setPhoneNumber(phoneNumber);
        UserInfo userInfo = getOne(new QueryWrapper<>(userQuery));
        if (ObjectUtils.isEmpty(userInfo)) {
            throw new ApiException("用户不存在");
        }
        BeanUtils.copyProperties(userInfo, authUser);
//        if (userDto.getRoleList() != null) {
//            authUser.setRoleList(userDto.getRoleList().stream()
//                    .map(r -> r.getId() + "_" + r.getName())
//                    .collect(Collectors.toList()));
//        }
        return authUser;
    }

    private UserInfoDto convertToDto(UserInfo userInfo) {
        UserInfoDto userInfoDto = new UserInfoDto();
        BeanUtils.copyProperties(userInfo, userInfoDto);
        return userInfoDto;
    }
}
