package com.qxy.nacos.provider8000.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 12:28
 * @Introduction:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Value("${server.port}")
    Integer port;

    @GetMapping("findById/{id}")
    public String findById(@PathVariable("id") Integer id) {
        return "nacos-provider.port:" + port + " | id:" + id;
    }
}
