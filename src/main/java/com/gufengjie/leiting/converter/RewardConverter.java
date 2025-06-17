package com.gufengjie.leiting.converter;

import com.gufengjie.leiting.entity.reward.Reward;
import com.gufengjie.leiting.entity.reward.RewardCreateVo;
import com.gufengjie.leiting.entity.reward.RewardVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class RewardConverter {

    public static RewardVo convert(Reward  reward) {
        RewardVo rewardVo = new RewardVo();
        BeanUtils.copyProperties(rewardVo, rewardVo);

        return rewardVo;
    }

    public static Reward convert(RewardCreateVo rewardCreateVo) {
        Reward reward = new Reward();
        BeanUtils.copyProperties(rewardCreateVo, reward);

        return reward;
    }

    public static List<RewardVo> convert(List<Reward> rewards) {
        List<RewardVo> rewardVos = new ArrayList<RewardVo>();
        for (Reward reward : rewards) {
            rewardVos.add(convert(reward));
        }

        return rewardVos;
    }

}
