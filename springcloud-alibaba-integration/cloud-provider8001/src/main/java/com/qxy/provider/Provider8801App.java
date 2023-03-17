package com.qxy.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 20:59
 * @Introduction:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider8801App {
    public static void main(String[] args) {
        SpringApplication.run(Provider8801App.class, args);
    }
}
