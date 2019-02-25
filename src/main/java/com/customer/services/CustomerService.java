package com.customer.services;

import com.customer.entities.Customer;
import com.house.entities.HouseInNewComplex;

public interface CustomerService {
    void saveCustomerRequest(Customer customer);
    Customer getCustomerRequestByID(Customer customer);
    void sendEmail(Customer customer, HouseInNewComplex houseInNewComplex);
}
