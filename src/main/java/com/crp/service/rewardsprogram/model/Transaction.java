package com.crp.service.rewardsprogram.model;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "TRANSACTION")
public class Transaction
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private int transactionId;

    @Column(name="CUSTOMER_ID")
    private int customerId;

    @Column(name = "TRANSACTION_DATE")
    private Timestamp transactionDate;

    @Column(name = "TRANSACTION_AMOUNT")
    private double transactionAmount;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
