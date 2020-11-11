package com.trx.sharding.springbootshardingdemo.service;

public interface OrderItemService {

    void queryOrderItemById(Long orderId);

    void insertBatchOrderItem();
}
