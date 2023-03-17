package com.qxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: SayHello
 * @Date: 2023/3/15 21:47
 * @Introduction:
 */
@SpringBootApplication
@EnableConfigServer // 启用config server功能
@EnableEurekaClient //eureka客户端
public class ConfigServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp.class, args);
    }
}
