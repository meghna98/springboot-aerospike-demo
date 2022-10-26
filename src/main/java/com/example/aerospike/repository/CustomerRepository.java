package com.example.aerospike.repository;

import com.example.aerospike.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CustomerRepository {

    @Cacheable(key = "#id", value = "test")
    public Customer getCustomerById(String id){
        log.info("Cache Miss for id : {}", id);
        return new Customer("123", "Test User", "test@gmail.com", 24);
    }

    @CachePut(key = "#customer.id",value = "test")
    public Customer addCustomer(Customer customer){
        log.info("Adding new customer to DB : {}", customer);
        return customer;
    }
}

