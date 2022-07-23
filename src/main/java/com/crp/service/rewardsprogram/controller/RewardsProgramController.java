package com.crp.service.rewardsprogram.controller;

import com.crp.service.rewardsprogram.model.Customer;
import com.crp.service.rewardsprogram.model.Rewards;
import com.crp.service.rewardsprogram.repository.CustomerRepository;
import com.crp.service.rewardsprogram.service.RewardsProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RewardsProgramController {

    @Autowired
    RewardsProgramService rewardsProgramService;
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer> findCustomerAll() {
        return customerRepository.findAll();
    }
    @GetMapping(value="/{customerId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> findCustomer(@PathVariable("customerId") int customerId) {
//        return
        Customer temp = customerRepository.findById(customerId);

        return new ResponseEntity<>(temp, HttpStatus.OK);
    }

    @GetMapping(value = "/rewards/{customerId}")
    public Rewards getRewardsByCustomerId()
    {

        return null;
    }
}
