package com.gufengjie.leiting.controller;

import com.gufengjie.leiting.api.UserApi;
import com.gufengjie.leiting.entity.user.*;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("用户api")
@RequestMapping("/v1")
@RestController
public class UserController implements UserApi {
    @Override
    public UserVo create(UserCreateVo userCreateVo) {
        return null;
    }

    @Override
    public UserVo search(UserSearchVo userSearchVo) {
        return null;
    }

    @Override
    public List<User> search() {
        return List.of();
    }

    @Override
    public void deleteOne(Long userId) {

    }

    @Override
    public UserVo update(UserUpdateVo userUpdateVo, Long userId) {
        return null;
    }
}
