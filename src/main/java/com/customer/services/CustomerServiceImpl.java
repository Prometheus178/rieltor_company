package com.customer.services;

import com.customer.dao.CustomerDAO;
import com.customer.entities.Customer;
import com.house.entities.HouseInNewComplex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDAO customerDAO;

    @Transactional
    public void saveCustomerRequest(Customer customer) {
        customerDAO.saveCustomerRequest(customer);
    }

    @Override
    public void sendEmail(Customer customer, HouseInNewComplex houseInNewComplex) {

    }
}
