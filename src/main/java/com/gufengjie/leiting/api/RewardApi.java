package com.gufengjie.leiting.api;

import com.gufengjie.leiting.entity.reward.RewardCreateVo;
import com.gufengjie.leiting.entity.reward.RewardUpdateVo;
import com.gufengjie.leiting.entity.reward.RewardVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * 奖品Api
 */
@Api("奖品Api,此接口仅限管理员")
@RequestMapping("/v1")
public interface RewardApi {

    @ApiOperation("创建奖品")
    @RequestMapping(value = "/reward", method = RequestMethod.POST)
    RewardVo create(@ApiParam("创建奖品实体") @Valid @RequestBody RewardCreateVo rewardCreateVo);

    @ApiOperation("删除奖品")
    @RequestMapping(value = "/reward/{reward_id}", method = RequestMethod.DELETE)
    void delete(@ApiParam("奖品id") @PathVariable("reward_id") Long rewardId);

    @ApiOperation("获取所有奖品")
    @RequestMapping(value = "/reward", method = RequestMethod.GET)
    List<RewardVo> getRewards();

    @ApiOperation("更新某一奖品")
    @RequestMapping(value = "/reward/{reward_id}", method = RequestMethod.PUT)
    RewardVo update(@ApiParam("奖品id") @PathVariable("reward_id") Long rewardId,
                    @ApiParam("奖品更新实体") @Valid @RequestBody RewardUpdateVo rewardUpdateVo);
}
