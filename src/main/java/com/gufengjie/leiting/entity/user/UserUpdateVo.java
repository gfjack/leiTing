package com.gufengjie.leiting.entity.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("修改用户")
@Data
public class UserUpdateVo {

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户手机号")
    private String phoneNumber;

}
