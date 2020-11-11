package com.trx.sharding.springbootshardingdemo.mapper;

import com.trx.sharding.springbootshardingdemo.entity.Order;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderMapper {

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
