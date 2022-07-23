package com.crp.service.rewardsprogram.repository;

import com.crp.service.rewardsprogram.model.Customer;
import com.crp.service.rewardsprogram.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {
    public List<Transaction> findAllTransactionsByCustomerId(int customerId);
}
