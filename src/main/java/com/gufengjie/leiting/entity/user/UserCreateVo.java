package com.gufengjie.leiting.entity.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("创建用户实体")
@Data
public class UserCreateVo {

    @ApiModelProperty("用户名")
    @NotBlank(message = "用户名不能为空")
    private String userName;

    @ApiModelProperty("用户手机号")
    @NotBlank(message = "手机号不能为空")
    private String phoneNumber;

}
