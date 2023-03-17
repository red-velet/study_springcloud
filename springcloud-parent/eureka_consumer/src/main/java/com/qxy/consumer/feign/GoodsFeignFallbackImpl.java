package com.qxy.consumer.feign;

import com.qxy.consumer.domain.Goods;
import org.springframework.stereotype.Component;

/**
 * @Author: SayHello
 * @Date: 2023/3/15 10:09
 * @Introduction:
 */
@Component
public class GoodsFeignFallbackImpl implements GoodsFeign {
    /**
     * 定义降级方法   返回特殊对象
     * 1、方法的返回值要和原方法一致
     * 2、方法参数和原方法一样
     */
    @Override
    public Goods findById(Integer id) {
        Goods goods = new Goods();
        goods.setId(-1);
        goods.setTitle("consumer消费方服务降级的方法");
        return goods;
    }
}
