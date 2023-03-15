package com.qxy.consumer.controller;

import com.qxy.consumer.domain.Goods;
import com.qxy.consumer.feign.GoodsFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 19:02
 * @Introduction:
 */
@RestController
@RequestMapping("/order")
public class OrderFeignController {
    @Autowired
    GoodsFeign goodsFeign;

    @GetMapping("/addFeign/{id}")
    public Goods add(@PathVariable("id") Integer id) {
        Goods goods = goodsFeign.findById(id);
        return goods;
    }
}
