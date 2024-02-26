package com.techone.springboot.service.impl;

import com.techone.springboot.mapper.CustomerMapper;
import com.techone.springboot.pojo.Customer;
import com.techone.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer findByEmail(String email) {
        Customer user = customerMapper.findByEmail(email);
        return user;
    }

    @Override
    public void register(String email, String password) {
        customerMapper.add(email, password);
    }
}
