package com.techone.springboot.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Order {
    private Integer orderId;
    private Integer customerId;
    private LocalDate orderDate;
    private Integer totalAmount;
}
