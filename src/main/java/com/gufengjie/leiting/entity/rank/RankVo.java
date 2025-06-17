package com.gufengjie.leiting.entity.rank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@ApiModel("排行榜实体")
@Data
public class RankVo {

    @ApiModelProperty("排行时间")
    private Date rankTime;

    @ApiModelProperty("排名信息")
    private Map<String,Long> rank;

}
