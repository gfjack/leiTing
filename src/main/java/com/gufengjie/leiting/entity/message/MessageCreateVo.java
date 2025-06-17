package com.gufengjie.leiting.entity.message;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("留言板创建vo")
@Data
public class MessageCreateVo {

    @ApiModelProperty("留言板用户id")
    private Long userId;

    @ApiModelProperty("留言内容")
    private Long message;

}
