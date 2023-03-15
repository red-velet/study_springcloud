package com.qxy.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qxy.provider.domain.Goods;
import com.qxy.provider.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 18:52
 * @Introduction:
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;


    @GetMapping("findById/{id}")
    @HystrixCommand(fallbackMethod = "findById_fallback")
    public Goods findById(@PathVariable("id") Integer id) {
        //模拟熔断
        if (id == 1) {
            int i = 1 / 0;
        }
        return goodsService.findById(id);
    }

    public Goods findById_fallback(Integer id) {
        Goods goods = new Goods();
        goods.setId(-1);
        goods.setTitle("provider提供方服务降级的方法");
        return goods;
    }
}
