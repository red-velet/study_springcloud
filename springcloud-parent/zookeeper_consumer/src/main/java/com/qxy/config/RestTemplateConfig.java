package com.qxy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 19:07
 * @Introduction: spring提供的支持的一个 HTTP 请求工具，它提供了常见的REST请求方案的模版
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
