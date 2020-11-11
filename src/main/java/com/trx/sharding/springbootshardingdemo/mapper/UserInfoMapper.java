package com.trx.sharding.springbootshardingdemo.mapper;


import com.trx.sharding.springbootshardingdemo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserInfoMapper {

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}
