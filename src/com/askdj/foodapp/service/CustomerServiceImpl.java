package com.askdj.foodapp.service;


import com.askdj.foodapp.exceptions.CustomerExistException;
import com.askdj.foodapp.model.Customer;
import com.askdj.foodapp.repository.CustomerRepository;

import java.util.Optional;

public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) throws CustomerExistException {
        Optional<Customer> customerById = this.customerRepository.findCustomerById(customer.getCustomerId());
        if(customerById.isPresent()){
            throw new CustomerExistException("Customer Id already present");
        }

        return this.customerRepository.save(customer);
    }
}
