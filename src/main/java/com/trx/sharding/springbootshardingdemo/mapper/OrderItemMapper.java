package com.trx.sharding.springbootshardingdemo.mapper;

import com.trx.sharding.springbootshardingdemo.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderItemMapper {

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}
