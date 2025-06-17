package com.gufengjie.leiting.entity.mark;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@ApiModel("分数实体")
@Data
public class MarkVo {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户有效积分")
    private Long validMark;

    @ApiModelProperty("用户总积分")
    private Long totalMark;

    @ApiModelProperty("用户历史积分详情")
    private List<Map<Date,Long>> preMarks;

}
