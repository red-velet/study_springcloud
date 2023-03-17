package com.qxy.consumer.controller;

import com.qxy.consumer.domain.Goods;
import com.qxy.consumer.feign.GoodsFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:10
 * @Introduction:
 */
@RestController
@RequestMapping("order")
@RefreshScope
public class OrderController {
    @Autowired
    GoodsFeign goodsFeign;

    //@Value("${name}")
    //String name;

    @GetMapping("add/{id}")
    public Goods add(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("id不能为负数");
        }
        return goodsFeign.findById(id);
    }

    //@GetMapping("name")
    //public String getMsg() {
    //    return name;
    //}
}
