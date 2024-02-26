package com.techone.springboot.mapper;

import com.techone.springboot.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerMapper {
    // 根據 E-MAIL 查詢用戶
    @Select("SELECT * FROM customers WHERE email=#{email}")
    Customer findByEmail(String email);

    // 添加
    @Insert("INSERT INTO customers(email, password, create_time, update_time)" +
            " VALUES (#{email}, #{password}, now(), now())")
    void add(String email, String password);
}
