package com.example.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class RedisConfiguration {
    @Bean
    public RedisConnectionFactory lettuceConnectionFactory() {
//        RedisSentinelConfiguration sentinelConfiguration = new RedisSentinelConfiguration()
//                .master("redis_master");
//                .sentinel("127.0.0.1", 6379);
//                .sentinel("127.0.0.1", 26379);
//        return new LettuceConnectionFactory(sentinelConfiguration);
        return new LettuceConnectionFactory("127.0.0.1", 6379);
    }
}
