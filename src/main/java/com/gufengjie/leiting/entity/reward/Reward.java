package com.gufengjie.leiting.entity.reward;

import com.gufengjie.leiting.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("奖品实体")
@Data
public class Reward extends BasePo implements Serializable {

    @ApiModelProperty("奖品id")
    private Long rewardId;

    @ApiModelProperty("奖品图片url")
    private String rewardUrl;

    @ApiModelProperty("奖品描述")
    private String description;

}
