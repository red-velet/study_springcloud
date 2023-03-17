package com.qxy.provider.controller;

import com.qxy.provider.domain.Goods;
import com.qxy.provider.servier.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:00
 * @Introduction:
 */
@RestController
@RequestMapping("goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("findById/{id}")
    public Goods findById(@PathVariable("id") Integer id) {
        return goodsService.findById(id);
    }
}
