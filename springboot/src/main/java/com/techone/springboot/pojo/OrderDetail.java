package com.techone.springboot.pojo;

import lombok.Data;

@Data
public class OrderDetail {
        private int orderDetailId;
        private int orderId;
        private int productId;
        private int quantity;
        private Integer unitPrice;

}
