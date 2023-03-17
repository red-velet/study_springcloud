package com.qxy.consumer.feign;

import com.qxy.consumer.domain.Goods;
import com.qxy.consumer.feign.impl.GoodsFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:15
 * @Introduction:
 */
@FeignClient(value = "cloud-provider", fallback = GoodsFeignImpl.class)
public interface GoodsFeign {
    @GetMapping("/goods/findById/{id}")
    public Goods findById(@PathVariable("id") Integer id);
}
