package com.qxy.sentinel.exceptionhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 17:07
 * @Introduction: 公共的流速限制类
 */
public class CommonHandler {
    public static String handleBlock(BlockException ex) {
        System.out.println("限流了");
        return "系统繁忙,请稍后再试!!!!!";
    }

    public static String handleBlock2(@RequestParam(value = "goodsId", required = false) String goodsId, BlockException ex) {
        System.out.println("限流了");
        return "系统繁忙,请稍后再试!!!!!";
    }
}
