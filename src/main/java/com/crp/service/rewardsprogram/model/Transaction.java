package com.crp.service.rewardsprogram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.security.Timestamp;

@Entity
@Table
public class Transaction
{

    @Column(name = "TRANSACTION_ID")
    private Long transactionId;

    @Column(name="CUSTOMER_ID")
    private Long customerId;

    @Column(name = "TRANSACTION_DATE")
    private Timestamp transactionDate;

    @Column(name = "TRANSACTION_AMOUNT")
    private double transactionAmount;

}
