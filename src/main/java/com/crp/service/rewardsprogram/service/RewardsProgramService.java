package com.crp.service.rewardsprogram.service;

import com.crp.service.rewardsprogram.model.Rewards;

public interface RewardsProgramService {

    public Rewards getRewardsByCustomerId(int customerId);
}
