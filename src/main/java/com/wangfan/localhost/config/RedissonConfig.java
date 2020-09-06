package com.wangfan.localhost.config;

import lombok.extern.log4j.Log4j2;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/25 16:08
 */
@Log4j2
@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient getRedisson(RedisProperties properties) {
        Config config = new Config();
        config.useSingleServer()
                .setAddress("redis://" + properties.getHost() + ":" + properties.getPort())
                .setPassword(properties.getPassword())
                .setConnectionPoolSize(Integer.parseInt(Objects.requireNonNull(properties.getMaxActive())))
                .setConnectTimeout(Integer.parseInt(Objects.requireNonNull(properties.getMaxWait())));
        return Redisson.create(config);
    }
}
