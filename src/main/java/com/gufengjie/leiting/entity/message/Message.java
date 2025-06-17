package com.gufengjie.leiting.entity.message;

import com.gufengjie.leiting.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@ApiModel("留言板")
@Data
public class Message extends BasePo implements Serializable {

    @ApiModelProperty("留言板id")
    private Long messageId;

    @ApiModelProperty("留言用户")
    private Long userId;

    @ApiModelProperty("留言内容")
    private Long message;

    @ApiModelProperty("是否可见")
    private Boolean isVisible;

    @ApiModelProperty("留言板回复")
    private String reply;
}
