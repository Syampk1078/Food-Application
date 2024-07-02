package com.askdj.foodapp.service;
import com.askdj.foodapp.exceptions.CustomerExistException;
import com.askdj.foodapp.model.Customer;
public interface CustomerService {

    public Customer save(Customer customer) throws CustomerExistException;
}
