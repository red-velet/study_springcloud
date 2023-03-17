package com.qxy.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 11:58
 * @Introduction:
 */
@Service
public class GoodsService {
    @SentinelResource("goods")
    public void queryGoods() {
        System.out.println("查询商品");
    }
}
