package com.gufengjie.leiting.controller;

import com.gufengjie.leiting.api.RankApi;
import com.gufengjie.leiting.entity.rank.RankVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("排行榜Api")
@RequestMapping("/1")
@RestController
public class RankController implements RankApi {
    @Override
    public RankVo getRankByWeek() {
        return null;
    }

    @Override
    public RankVo getRankByMonth() {
        return null;
    }

    @Override
    public RankVo getRank() {
        return null;
    }
}
