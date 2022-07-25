package com.crp.service.rewardsprogram.service;

import com.crp.service.rewardsprogram.model.Rewards;
import com.crp.service.rewardsprogram.model.Transaction;
import com.crp.service.rewardsprogram.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class RewardsProgramServiceImpl implements RewardsProgramService{

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public Rewards getRewardsByCustomerId(int customerId) {
        Timestamp lastMonth =  Timestamp.valueOf(LocalDateTime.now().minusDays(30));
        Timestamp secondLastMonth = Timestamp.valueOf(LocalDateTime.now().minusDays(60));
        Timestamp thirdLastMonth = Timestamp.valueOf(LocalDateTime.now().minusDays(90));
        Timestamp today = Timestamp.from(Instant.now());

        List<Transaction> lastMonthTransactions = transactionRepository.findAllTransactionFromDateBetween(customerId, lastMonth, today);
        List<Transaction> secondLastMonthTransactions = transactionRepository.findAllTransactionFromDateBetween(customerId, secondLastMonth, lastMonth);
        List<Transaction> thirdLastMonthTransactions = transactionRepository.findAllTransactionFromDateBetween(customerId, thirdLastMonth, secondLastMonth);

        double lastMonthRewards = getRewards(lastMonthTransactions);
        double secondLastMonthRewards = getRewards(secondLastMonthTransactions);
        double thirdLastMonthRewards = getRewards(thirdLastMonthTransactions);
        Rewards rewardpoints = new Rewards(customerId, lastMonthRewards, secondLastMonthRewards, thirdLastMonthRewards);

        return rewardpoints;

    }

    private double getRewards(List<Transaction> transactions)
    {
        return transactions.stream().map(transaction -> calculateRewards(transaction)).collect(Collectors.summingDouble(points -> points.doubleValue()));
    }

    private double calculateRewards(Transaction transaction) {
        int points = 0;
        if(transaction.getTransactionAmount() > 50 && transaction.getTransactionAmount() <100){
            points += Math.round(transaction.getTransactionAmount() - 50) * 1;
            return points;
        }
        else if (transaction.getTransactionAmount() > 100){
                points+= (Math.round((transaction.getTransactionAmount()- 100) * 2) + 50);
        return points;
        }
        else
        return 0;
    }

}
