package com.gufengjie.leiting.entity.mark;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("积分查询表")
@Data
public class MarkSearchVo {

    @ApiModelProperty("用户id")
    @NotBlank(message = "用户id不能为空")
    private Long userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户手机号")
    private String phoneNumber;
}
