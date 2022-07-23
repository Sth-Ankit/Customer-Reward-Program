package com.crp.service.rewardsprogram.repository;

import com.crp.service.rewardsprogram.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public List<Customer> findAll();

    public Customer findById(int id);
//    public Customer findByCustomerId(int id);
}
