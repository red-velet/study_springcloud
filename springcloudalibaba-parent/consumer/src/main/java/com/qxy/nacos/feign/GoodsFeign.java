package com.qxy.nacos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 14:32
 * @Introduction:
 */
@FeignClient("nacos-provider")
public interface GoodsFeign {
    @GetMapping("/goods/findById/{id}")
    public String findById(@PathVariable("id") Integer id);
}
