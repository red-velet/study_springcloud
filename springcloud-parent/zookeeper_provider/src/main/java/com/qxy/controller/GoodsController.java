package com.qxy.controller;

import com.qxy.domain.Goods;
import com.qxy.service.GoodsService;
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
    public Goods findById(@PathVariable("id") Integer id) {
        return goodsService.findById(id);
    }
}
