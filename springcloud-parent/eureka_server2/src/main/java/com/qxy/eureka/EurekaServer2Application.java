package com.qxy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 19:31
 * @Introduction: Eureka注册中心的服务端
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class, args);
    }
}
