package com.askdj.foodapp.util;

import com.askdj.foodapp.controller.CustomerController;
import com.askdj.foodapp.repository.CustomerRepository;
import com.askdj.foodapp.service.CustomerServiceImpl;

public class Factory {

    public static CsvReader getCsvReader(){
        return new CsvReader();
    }

    public static CustomerRepository getCustomerRepository(){
        return new CustomerRepository();
    }

    public static CustomerServiceImpl getCustomerService(){
        return new CustomerServiceImpl(getCustomerRepository());
    }

    public static CustomerController getCustomerController(){
        return new CustomerController(getCustomerService());
    }

}
