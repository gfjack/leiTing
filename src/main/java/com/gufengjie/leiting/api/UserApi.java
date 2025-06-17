package com.gufengjie.leiting.api;

import com.gufengjie.leiting.entity.user.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 用户Api接口
 */
@Api("用户api")
@RequestMapping("/v1")
public interface UserApi {

    @ApiOperation("创建用户")
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    UserVo create(@ApiParam("创建用户实体") @Valid @RequestBody UserCreateVo userCreateVo);

    @ApiOperation("根据条件查询单一用户")
    @RequestMapping(value = "/users/actions/search", method = RequestMethod.POST)
    UserVo search(@ApiParam("查询用户实体") @RequestBody UserSearchVo userSearchVo);

    @ApiOperation("获取所有用户")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    List<User> search();

    @ApiOperation("根据id删除某一用户")
    @RequestMapping(value = "/users/{user_id}", method = RequestMethod.DELETE)
    void deleteOne(@ApiParam("客户id") @PathVariable("user_id") Long userId);

    @ApiOperation("修改用户信息")
    @RequestMapping(value = "/users/{user_id}/actions/update", method = RequestMethod.PUT)
    UserVo update(@ApiParam("更新客户实体") @RequestBody UserUpdateVo userUpdateVo,
                  @PathVariable("user_id") Long userId);
}
