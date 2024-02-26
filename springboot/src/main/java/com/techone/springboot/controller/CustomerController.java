package com.techone.springboot.controller;

import com.techone.springboot.pojo.Customer;
import com.techone.springboot.pojo.Result;
import com.techone.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@Validated
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public Result register(String email, String password) {
        Customer user = customerService.findByEmail(email);
        if (user == null) {
            // 沒有佔用，即註冊
            customerService.register(email, password);
            return Result.success();
        } else {
            // 佔用
            return Result.error("已註冊");
        }
    }
}
