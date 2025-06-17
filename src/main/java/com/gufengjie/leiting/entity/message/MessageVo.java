package com.gufengjie.leiting.entity.message;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("留言板Vo")
@Data
public class MessageVo {

    @ApiModelProperty("留言板id")
    private Long messageId;

    @ApiModelProperty("留言用户id")
    private Long userId;

    @ApiModelProperty("留言内容")
    private Long message;

    @ApiModelProperty("留言板回复")
    private String reply;
}
