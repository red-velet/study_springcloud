package com.qxy.nacos.controller;

import com.qxy.nacos.feign.GoodsFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 14:15
 * @Introduction:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    GoodsFeign goodsFeign;

    @GetMapping("/add/{id}")
    public String add(@PathVariable("id") Integer id) {
        String url = "http://nacos-provider/goods/findById/" + id;
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping("/add2/{id}")
    public String add2(@PathVariable("id") Integer id) {
        return goodsFeign.findById(id);
    }
}
