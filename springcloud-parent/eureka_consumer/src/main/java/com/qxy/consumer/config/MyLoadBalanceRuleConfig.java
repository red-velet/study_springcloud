package com.qxy.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: SayHello
 * @Date: 2023/3/15 8:19
 * @Introduction:
 */
@Configuration
public class MyLoadBalanceRuleConfig {
    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
