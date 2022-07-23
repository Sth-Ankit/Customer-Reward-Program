package com.crp.service.rewardsprogram.service;

import com.crp.service.rewardsprogram.model.Rewards;
import com.crp.service.rewardsprogram.model.Transaction;
import com.crp.service.rewardsprogram.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static java.sql.Timestamp.valueOf;

@Service
public class RewardsProgramServiceImpl implements RewardsProgramService{

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public Rewards getRewardsByCustomerId(int customerId) {


        List<Transaction> lastMonthTransactions = transactionRepository.findAllTransactionsByCustomerId(customerId);

        double lastMonthRewards = getRewards(lastMonthTransactions);
        Rewards rewardpoints = new Rewards(customerId, lastMonthRewards);

        return rewardpoints;
    }

    private double getRewards(List<Transaction> transactions)
    {
        return transactions.stream().map(transaction -> calculateRewards(transaction)).collect(Collectors.summingDouble(points -> points.doubleValue()));
    }

    private double calculateRewards(Transaction transaction) {
        int points = 0;
        if(transaction.getTransactionAmount() > 50 && transaction.getTransactionAmount() <100){
            points += Math.round(transaction.getTransactionAmount() - 50)*1;
            return points;
        }
        else if (transaction.getTransactionAmount() > 100){
                points+= (Math.round((transaction.getTransactionAmount()- 100)*2)+50);
        return points;
        }
        else
        return 0;
    }

}
