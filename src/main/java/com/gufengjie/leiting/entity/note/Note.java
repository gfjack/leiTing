package com.gufengjie.leiting.entity.note;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel("公告实体")
@Data
public class Note implements Serializable {

    @ApiModelProperty("id")
    private Long nodeId;

    @ApiModelProperty("公告日期")
    private Data data;

    @ApiModelProperty("公告内容")
    private String content;

}
