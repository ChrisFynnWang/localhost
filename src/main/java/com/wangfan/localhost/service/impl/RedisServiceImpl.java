package com.wangfan.localhost.service.impl;

import com.wangfan.localhost.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class RedisServiceImpl implements RedisService {

    private static final String REDIS_LOCK = "REDIS_LOCK";

    @Autowired
    private RedissonClient redissonClient;

    @Override
    public void redisLock() {
        RLock lock = redissonClient.getLock(REDIS_LOCK);
        try {
            lock.tryLock(10, TimeUnit.SECONDS);
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            log.error("获取锁超时");
        }
        System.out.println("redis");
    }
}
