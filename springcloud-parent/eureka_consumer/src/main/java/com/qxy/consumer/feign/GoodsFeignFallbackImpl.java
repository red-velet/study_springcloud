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
    @Override
    public Goods findById(Integer id) {
        Goods goods = new Goods();
        goods.setId(-1);
        goods.setTitle("consumer消费方服务降级的方法");
        return goods;
    }
}
