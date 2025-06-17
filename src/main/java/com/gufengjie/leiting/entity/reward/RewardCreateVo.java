package com.gufengjie.leiting.entity.reward;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("奖品创建Vo")
@Data
public class RewardCreateVo {

    @ApiModelProperty("奖品图片url")
    private String rewardUrl;

    @ApiModelProperty("奖品描述")
    @NotBlank(message = "奖品描述不能为空")
    private String description;
}
