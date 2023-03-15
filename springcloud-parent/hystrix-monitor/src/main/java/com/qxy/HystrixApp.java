package com.qxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @Author: SayHello
 * @Date: 2023/3/15 10:34
 * @Introduction:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine //开启Turbine 很聚合监控功能
@EnableHystrixDashboard //开启Hystrix仪表盘监控功能
public class HystrixApp {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApp.class, args);
    }
}
