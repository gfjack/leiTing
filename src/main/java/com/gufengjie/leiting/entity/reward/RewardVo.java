package com.gufengjie.leiting.entity.reward;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("奖品Vo")
@Data
public class RewardVo {

    @ApiModelProperty("奖品id")
    private Long rewardId;

    @ApiModelProperty("奖品图片url")
    private String rewardUrl;

    @ApiModelProperty("奖品描述")
    private String description;
}
