package com.gufengjie.leiting.controller;

import com.gufengjie.leiting.api.RewardApi;
import com.gufengjie.leiting.entity.reward.RewardCreateVo;
import com.gufengjie.leiting.entity.reward.RewardUpdateVo;
import com.gufengjie.leiting.entity.reward.RewardVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("奖品Api,此接口仅限管理员")
@RequestMapping("/v1")
@RestController
public class RewardController implements RewardApi {
    @Override
    public RewardVo create(RewardCreateVo rewardCreateVo) {
        return null;
    }

    @Override
    public void delete(Long rewardId) {

    }

    @Override
    public List<RewardVo> getRewards() {
        return List.of();
    }

    @Override
    public RewardVo update(Long rewardId, RewardUpdateVo rewardUpdateVo) {
        return null;
    }
}
