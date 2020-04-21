package com.spring.mongodb.api;

import com.spring.mongodb.model.Customer;
import com.spring.mongodb.services.CustomerServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerControllerClass {
    @Autowired
    private CustomerServiceClass service;

    @PostMapping("/addCustomer")
    public String addCustomerToRegister(@RequestBody Customer customer)
    {
        service.addCustomerDetails(customer);
        return "Customer Added";
    }
    @GetMapping("/getCutomer")
    public List<Customer> getCustomer()
    {
        return service.getCustomerDetails();
    }
    @GetMapping("/getCustomerByName/{name}")
    public Customer getDetailsByName(@PathVariable String name)
    {
        return service.getCustomerByName(name);
    }

    @GetMapping("/getCustomerByCity/{city}")
    public List<Customer> getCustomerByCity(@PathVariable String city)
    {
       return service.getCustomerByCity(city);
    }


}
