package com.crp.service.rewardsprogram.repository;

import com.crp.service.rewardsprogram.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, int>{
    public Customer findbyId(int customerId);
}
