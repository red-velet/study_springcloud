package com.qxy.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:09
 * @Introduction:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Consumer9000App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer9000App.class, args);
    }
}
