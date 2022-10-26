package com.example.aerospike.service.impl;

import com.example.aerospike.model.Customer;
import com.example.aerospike.repository.CustomerRepository;
import com.example.aerospike.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(String id) {
        log.info("Service : getCustomer with id : {}", id);
        return customerRepository.getCustomerById(id);
    }

    @Override
    public Customer getCustomerByIdAndName(String id, String name) {
        log.info("Service : getCustomer with id : {} & name : {}", id, name);
        return customerRepository.getCustomerById(id);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        log.info("Service : addCustomer with customer : {}", customer);
        customer.setAge(30);
        return customerRepository.addCustomer(customer);
    }
}
