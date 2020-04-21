package com.spring.mongodb.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@AllArgsConstructor
@Document(collection = "order_Db")
public class Customer {
    @JsonProperty("Customer Id")
    private int custId;
    @JsonProperty("Name")
    private  String custName;
    @JsonProperty("MobileNo")
    private String custMobNo;
    @JsonProperty("Address")
    private Address address;
    @JsonProperty("Product")
    private List<Product> product;

}
