package com.gufengjie.leiting.entity.message;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("留言板更新vo")
@Data
public class MessageUpdateVo {

    @ApiModelProperty("留言板用户id")
    private Long userId;

    @ApiModelProperty("留言内容")
    private Long message;

    @ApiModelProperty("是否可见")
    private Boolean isVisible;

    @ApiModelProperty("留言板回复")
    private String reply;
}
