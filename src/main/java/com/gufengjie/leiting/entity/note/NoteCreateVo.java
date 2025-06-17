package com.gufengjie.leiting.entity.note;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@ApiModel("公告创建实体")
@Data
public class NoteCreateVo {

    @ApiModelProperty("公告日期")
    @NotBlank
    private Data data;

    @ApiModelProperty("公告内容")
    private String content;

}
