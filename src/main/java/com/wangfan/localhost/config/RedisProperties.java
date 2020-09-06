package com.wangfan.localhost.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author : Chris Wang
 * @Description :
 * @Date : 2019/6/25 16:16
 */
@Component
@Getter
public class RedisProperties {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private String port;

    @Value("${spring.redis.password}")
    private String password;

    @Value("${spring.redis.pool.max-active}")
    private String maxActive;

    @Value("${spring.redis.pool.max-wait}")
    private String maxWait;

    @Value("${spring.redis.pool.max-idle}")
    private String maxIdle;

    @Value("${spring.redis.pool.min-idle}")
    private String minIdle;

}
