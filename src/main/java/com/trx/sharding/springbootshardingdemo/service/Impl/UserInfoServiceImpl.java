package com.trx.sharding.springbootshardingdemo.service.Impl;


import com.trx.sharding.springbootshardingdemo.entity.UserInfo;
import com.trx.sharding.springbootshardingdemo.mapper.UserInfoMapper;
import com.trx.sharding.springbootshardingdemo.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public static Long userId = 1L;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertBatchUserInfo() {
        log.info("insertBatchUserInfo--------------");
        for (int i = 1; i <= 10; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(userId);
            userInfo.setAccount("Account" + i);
            userInfo.setPassword("pass" + i);
            userInfo.setUserName("name" + i);
            userId++;
            userInfoMapper.insert(userInfo);
        }
        log.info("over..........");
    }

    @Override
    public void queryUserIfo(Long uid) {
        UserInfo user = userInfoMapper.selectByPrimaryKey(uid);
        log.info("user:[{}]",user);
    }

    /**
     * 跨库事务 XA
     */
    @Override
    @ShardingTransactionType(TransactionType.XA)
    @Transactional(rollbackFor = Exception.class)
    public void testTransactional() {
        // 取模 121:3306/ds0
        UserInfo user1 = new UserInfo();
        user1.setUserId(2675L);
        user1.setAccount("62260975");
        user1.setPassword("123456");
        user1.setUserName("qingshan");
        this.userInfoMapper.insert(user1);

        // 取模 121:3306/ds1
        UserInfo user2 = new UserInfo();
        user2.setUserId(2673L);
        user2.setAccount("400800900");
        user2.setUserName("admin");
        user2.setPassword("admin");
        // 主键冲突
        this.userInfoMapper.insert(user2);
        // this.userInfoMapper.insert(user2);
    }

}
