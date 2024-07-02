package com.askdj.foodapp.util;

import com.askdj.foodapp.model.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
//    Read the data from CSV files and create list of objects


    String customerCsvFilePath = "D:\\Real Time Projects\\Foodie-CLI-App\\data\\customers.csv";
    List<Customer> customerList = new ArrayList<>();

    public List<Customer> readCustomerFromCsv(){
        String line;
        String csvSplitBy = ",";
        try(BufferedReader br = new BufferedReader(new FileReader(customerCsvFilePath))){
            br.readLine();
            while((line = br.readLine()) != null){
                String[] data = line.split(csvSplitBy);
                Customer customer = new Customer();
                customer.setId(data[0])
                        .setName(data[1])
                        .setEmail(data[2])
                        .setPassword(data[3]);
                customerList.add(customer);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return customerList;
    }
}
