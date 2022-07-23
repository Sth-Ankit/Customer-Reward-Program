package com.crp.service.rewardsprogram.model;

public class Rewards
{
    private int customerId;
    private int firstMonthRewardPoints;
    private int secondMonthRewardPoints;
    private int thirdMonthRewardPoints;
    private int totalRewards;

    public int getCustomerId(){ return customerId;}

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFirstMonthRewardPoints() {
        return firstMonthRewardPoints;
    }

    public int getSecondMonthRewardPoints() {
        return secondMonthRewardPoints;
    }

    public int getThirdMonthRewardPoints() {
        return thirdMonthRewardPoints;
    }

    public int getTotalRewards() {
        return totalRewards;
    }

    public void setFirstMonthRewardPoints(int firstMonthRewardPoints) {
        this.firstMonthRewardPoints = firstMonthRewardPoints;
    }

    public void setSecondMonthRewardPoints(int secondMonthRewardPoints) {
        this.secondMonthRewardPoints = secondMonthRewardPoints;
    }

    public void setThirdMonthRewardPoints(int thirdMonthRewardPoints) {
        this.thirdMonthRewardPoints = thirdMonthRewardPoints;
    }

    public void setTotalRewards(int totalRewards) {
        this.totalRewards = totalRewards;
    }
}
