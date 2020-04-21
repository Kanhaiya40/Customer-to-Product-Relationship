package com.spring.mongodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Product {
    @JsonProperty("Product Id")
    private int productId;
    @JsonProperty("Name")
    private String productName;
    @JsonProperty("SerialNo")
    private String productSerialNo;
    @JsonProperty("Price")
    private int price;
}
