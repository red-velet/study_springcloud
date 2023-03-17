package com.qxy.nacos.provider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 12:35
 * @Introduction:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class, args);
    }
}
