package com.gufengjie.leiting.api;

import com.gufengjie.leiting.entity.rank.RankVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 排行榜Api
 */
@Api("排行榜Api")
@RequestMapping("/1")
public interface RankApi {

    @ApiOperation("获取每周排行榜")
    RankVo getRankByWeek();

    @ApiOperation("获取当月排行榜")
    RankVo getRankByMonth();

    @ApiOperation("获取总排行榜")
    RankVo getRank();
}
