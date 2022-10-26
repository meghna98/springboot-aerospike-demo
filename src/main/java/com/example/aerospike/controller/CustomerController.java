package com.example.aerospike.controller;

import com.example.aerospike.model.Customer;
import com.example.aerospike.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api")
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id){
        log.info("Request to get customer by id : {}", id );
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @GetMapping("/customer/{id}/{name}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String id, @PathVariable String name){
        log.info("Request to get customer by id : {} & name : {}", id, name );
        return ResponseEntity.ok(customerService.getCustomerByIdAndName(id, name));
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        log.info("Request to add customer : {}", customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addCustomer(customer));
    }
}
