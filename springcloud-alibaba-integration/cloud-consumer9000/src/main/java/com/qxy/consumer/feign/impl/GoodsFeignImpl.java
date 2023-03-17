package com.qxy.consumer.feign.impl;

import com.qxy.consumer.domain.Goods;
import com.qxy.consumer.feign.GoodsFeign;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:17
 * @Introduction: 调用出错的补救措施
 */
public class GoodsFeignImpl implements GoodsFeign {
    @Override
    public Goods findById(Integer id) {
        Goods goods = new Goods();
        goods.setId(-1);
        goods.setTitle("空空空空空空空空");
        goods.setPrice(-9999.0);
        goods.setStore(-100);
        return goods;
    }
}
