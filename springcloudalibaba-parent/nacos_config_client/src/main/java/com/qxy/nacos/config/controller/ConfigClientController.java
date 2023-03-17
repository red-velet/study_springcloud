package com.qxy.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 14:51
 * @Introduction:
 */
@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigClientController {
    @Value("${name}")
    String name;

    @GetMapping("name")
    public String getMsg() {
        return name;
    }
}
