package com.gufengjie.leiting.converter;

import com.gufengjie.leiting.entity.user.User;
import com.gufengjie.leiting.entity.user.UserCreateVo;
import com.gufengjie.leiting.entity.user.UserVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class UserConverter {

    public static User convert(UserCreateVo userCreateVo) {
        User user = new User();
        BeanUtils.copyProperties(userCreateVo, user);

        return user;
    }

    public static UserVo convert(User user) {
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);

        return userVo;
    }

    public static List<UserVo> convert(List<User> list) {
        List<UserVo> userVos = new ArrayList<>();
        for (User user : list) {
            UserVo userVo = convert(user);
            userVos.add(userVo);
        }

        return userVos;
    }

}
