package com.trx.sharding.springbootshardingdemo.service.Impl;


import com.trx.sharding.springbootshardingdemo.entity.Order;
import com.trx.sharding.springbootshardingdemo.mapper.OrderMapper;
import com.trx.sharding.springbootshardingdemo.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    public static Long orderId = 1L;

    @Override
    public void queryOrderById(Long orderId) {
        log.info(">>>>>>>>>queryOrderById>>>>>>>>>");
        Order order = orderMapper.selectByPrimaryKey(orderId);
        log.info(">>>>>>>>>order:[{}]",order);
    }

    @Override
    public void insertBatchOrder() {
        System.out.println(">>>>>>>>>>>>insertBatchOrderInfo>>>>>>>>>>>>");
        for (int i = 1; i <= 10; i++) {
            Order order = new Order();
            order.setOrderId(orderId);
            order.setUserId(orderId);
            orderId++;
            orderMapper.insert(order);
        }
        System.out.println(">>>>>>>>>>>>over>>>>>>>>>>>>");
    }
}
