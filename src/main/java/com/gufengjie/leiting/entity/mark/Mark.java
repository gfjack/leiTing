package com.gufengjie.leiting.entity.mark;

import com.gufengjie.leiting.entity.BasePo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@ApiModel("积分表")
@Data
public class Mark extends BasePo implements Serializable {

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户有效积分")
    private Long validMark;

    @ApiModelProperty("用户总积分")
    private Long totalMark;

    @ApiModelProperty("用户历史积分详情")
    private List<Map<Date,Long>> preMarks;

}
