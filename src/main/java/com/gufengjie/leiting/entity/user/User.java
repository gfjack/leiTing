package com.gufengjie.leiting.entity.user;

import com.gufengjie.leiting.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("用户表")
@Data
public class User extends BasePo implements Serializable {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户手机号")
    private String phoneNumber;

}
