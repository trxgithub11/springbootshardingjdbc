package com.trx.sharding.springbootshardingdemo;

import com.trx.sharding.springbootshardingdemo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class SpringbootShardingDemoApplicationTests {

    @Autowired
    private UserInfoService userInfoService;
    @Test
    void contextLoads() {
    }

    @Test
    public void insertUser(){
        userInfoService.insertBatchUserInfo();
    }
    @Test
    public void queryUser(){

        userInfoService.queryUserIfo(2L);
    }

    @Test
    public void  transTest(){


        userInfoService.testTransactional();
    }

}
