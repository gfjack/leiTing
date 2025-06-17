package com.gufengjie.leiting.entity.note;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("公告返回实体")
@Data
public class NoteVo {

    @ApiModelProperty("id")
    private Long nodeId;

    @ApiModelProperty("公告日期")
    private Data data;

    @ApiModelProperty("公告内容")
    private String content;

}
