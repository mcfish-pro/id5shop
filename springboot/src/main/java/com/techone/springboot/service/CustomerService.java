package com.techone.springboot.service;

import com.techone.springboot.pojo.Customer;

public interface CustomerService {

    // 根據 E-MAIL 查詢客戶
    Customer findByEmail(String email);

    void register(String email, String password);
}
