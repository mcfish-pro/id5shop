package com.techone.springboot.pojo;

import lombok.Data;

@Data
public class Product {
    private Integer productId;
    private String productName;
    private Integer price;
    private String description;

}
