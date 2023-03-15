package com.qxy.consumer.feign;

import com.qxy.consumer.config.FeignLogConfig;
import com.qxy.consumer.domain.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: SayHello
 * @Date: 2023/3/15 8:31
 * @Introduction:
 */
@FeignClient(value = "EUREKA-PROVIDER",
        configuration = FeignLogConfig.class,
        fallback = GoodsFeignFallbackImpl.class)
public interface GoodsFeign {
    @GetMapping("/goods/findById/{id}")
    public Goods findById(@PathVariable("id") Integer id);
}
