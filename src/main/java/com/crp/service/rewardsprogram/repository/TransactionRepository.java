package com.crp.service.rewardsprogram.repository;

import com.crp.service.rewardsprogram.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
    public List<Transaction> findAllByCustomerId(int customerId);

    public List<Transaction>   findAllTransactionFromDateBetween(int customerId, Timestamp from, Timestamp to);
}
