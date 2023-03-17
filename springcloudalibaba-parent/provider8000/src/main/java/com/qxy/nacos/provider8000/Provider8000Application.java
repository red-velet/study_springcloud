package com.qxy.nacos.provider8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Provider8000Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8000Application.class, args);
    }
}
