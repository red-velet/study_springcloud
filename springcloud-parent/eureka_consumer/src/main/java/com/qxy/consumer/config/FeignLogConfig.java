package com.qxy.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: SayHello
 * @Date: 2023/3/15 8:45
 * @Introduction:
 */
@Configuration
public class FeignLogConfig {
    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
