package com.spring.mongodb.services;

import com.spring.mongodb.dao.CustomerRepo;
import com.spring.mongodb.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CustomerServiceClass {

    @Autowired
    private CustomerRepo daoCustomer;

    public Customer addCustomerDetails(Customer customer)
    {
        return daoCustomer.save(customer);
    }
    public List<Customer> getCustomerDetails()
    {
        return daoCustomer.findAll();
    }

    public Customer getCustomerByName(String name)
    {
        return daoCustomer.findAllByCustName(name);
    }

    public List<Customer> getCustomerByCity(String city) {return daoCustomer.findByCity(city);   }
}
