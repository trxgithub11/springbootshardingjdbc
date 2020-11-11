package com.trx.sharding.springbootshardingdemo.service;

public interface OrderService {

    void queryOrderById(Long orderId);

    void insertBatchOrder();
}
