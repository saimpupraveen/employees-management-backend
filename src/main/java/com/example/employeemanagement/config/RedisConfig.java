package com.example.employeemanagement.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

public class RedisConfig {

	 @Bean
	    public RedisCacheConfiguration redisCacheConfiguration() {
	        return RedisCacheConfiguration.defaultCacheConfig()
	                .entryTtl(Duration.ofMinutes(10))
	                .disableCachingNullValues()
	                .serializeValuesWith(
	                    RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer())
	                );
	    }
}
