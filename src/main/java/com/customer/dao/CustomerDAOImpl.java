package com.customer.dao;

import com.customer.entities.Customer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionF) {
        this.sessionFactory = sessionF;
    }
    public void saveCustomerRequest(Customer customer){

    }
}
