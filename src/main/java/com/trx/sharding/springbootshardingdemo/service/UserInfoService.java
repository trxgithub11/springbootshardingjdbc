package com.trx.sharding.springbootshardingdemo.service;

public interface UserInfoService {

    void insertBatchUserInfo();

    void queryUserIfo(Long uid);

    void testTransactional();
}
