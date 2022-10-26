package com.example.aerospike.service;


import com.example.aerospike.model.Customer;

public interface CustomerService {
    Customer  getCustomerById(String id);

    Customer  getCustomerByIdAndName(String id, String name);
    Customer addCustomer(Customer customer);
}
