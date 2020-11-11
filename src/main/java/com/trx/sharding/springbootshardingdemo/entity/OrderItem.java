package com.trx.sharding.springbootshardingdemo.entity;

import lombok.Data;

@Data
public class OrderItem {

    private Long OrderId;

    private String userName;


    private String account;

    private String password;
}
