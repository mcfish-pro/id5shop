package com.techone.springboot.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Customer {
    private Integer customerId ;
    private String customerName;
    private String email;
    @JsonIgnore     // 讓 Spring MVC 將當前對象轉成 json 的時候，忽略 password，最終 json 裡沒有 password 屬性
    private String password;
    private String phone;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
