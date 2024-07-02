package com.askdj.foodapp.controller;


import com.askdj.foodapp.exceptions.CustomerExistException;
import com.askdj.foodapp.model.Customer;
import com.askdj.foodapp.service.CustomerService;

public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    public Customer save(Customer customer) throws CustomerExistException {
        return this.customerService.save(customer);
    }
}
