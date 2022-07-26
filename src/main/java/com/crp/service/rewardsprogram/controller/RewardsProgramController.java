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

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class RewardsProgramController {

    @Autowired
    RewardsProgramService rewardsProgramService;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> findCustomerAll() {

        return ResponseEntity.ok(customerRepository.findAll());
    }
    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> findCustomer(@PathVariable("customerId") int customerId) {

        return ResponseEntity.ok(customerRepository.findById(customerId));
    }

    @GetMapping(value = "/rewards/{customerId}")
    public ResponseEntity<Rewards> getRewardsByCustomerId(@PathVariable("customerId") int customerId)
    {
        Customer customer = customerRepository.findById(customerId);
        Rewards rewardPoints = rewardsProgramService.getRewardsByCustomerId(customerId);
        return ResponseEntity.ok(rewardPoints);

    }
}
