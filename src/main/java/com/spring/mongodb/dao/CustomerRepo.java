package com.spring.mongodb.dao;

import com.spring.mongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepo extends MongoRepository<Customer,Integer> {
    Customer findAllByCustName(String name);

    @Query("{'Address.city':?0}")
    List<Customer> findByCity(String city);
}
