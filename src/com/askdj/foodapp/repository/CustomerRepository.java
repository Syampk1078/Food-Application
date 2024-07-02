package com.askdj.foodapp.repository;

import com.askdj.foodapp.model.Customer;
import com.askdj.foodapp.util.CsvReader;

import java.util.List;
import java.util.Optional;

public class CustomerRepository {

    private List<Customer> customerList;

    public CustomerRepository(){
        CsvReader csvReader = new CsvReader();
        this.customerList = csvReader.readCustomerFromCsv();
    }

    public List<Customer> getCustomerList(){
        return this.customerList;
    }

    public Customer save(Customer customer){
        this.customerList.add(customer);
        return customer;
    }

    public Optional<Customer> findCustomerById(String id){
        return this.customerList.stream().filter(customer -> customer.getCustomerId().equals(id)).findFirst();
    }
}
