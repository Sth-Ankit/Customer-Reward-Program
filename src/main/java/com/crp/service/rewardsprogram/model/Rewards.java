package com.crp.service.rewardsprogram.model;

public class Rewards
{
    private int customerId;
    private double firstMonthRewardPoints;
    private double secondMonthRewardPoints;
    private double thirdMonthRewardPoints;
    private double totalRewards;

    public Rewards(int id, double points)
    {
        this.customerId = id;
        this.totalRewards = points;
    }

    public double getCustomerId(){ return customerId;}

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getFirstMonthRewardPoints() {
        return firstMonthRewardPoints;
    }

    public double getSecondMonthRewardPoints() {
        return secondMonthRewardPoints;
    }

    public double getThirdMonthRewardPoints() {
        return thirdMonthRewardPoints;
    }

    public double getTotalRewards() {
        return totalRewards;
    }

    public void setFirstMonthRewardPodoubles(double points) {
        this.firstMonthRewardPoints = points;
    }

    public void setSecondMonthRewardPodoubles(double points) {
        this.secondMonthRewardPoints = points;
    }

    public void setThirdMonthRewardPodoubles(double points) {
        this.thirdMonthRewardPoints = points;
    }

    public void setTotalRewards(double totalRewards) {
        this.totalRewards = totalRewards;
    }
}
