package com.qxy.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.qxy.sentinel.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 11:23
 * @Introduction:
 */
@RestController
@RequestMapping("/demo")
public class FlowLimitController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/testA")
    public String testA() {
        //try {
        //    Thread.sleep(10000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        goodsService.queryGoods();
        return "用户下单模块----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        System.out.println(System.currentTimeMillis());
        goodsService.queryGoods();
        System.out.println(System.currentTimeMillis());
        return "减库存模块----testB";
    }

    @GetMapping("/testC/{id}")
    @SentinelResource(value = "timeout")
    public String testC(@PathVariable("id") Integer id) {
        System.out.println("id = " + id);
        if (id == 1) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "减库存模块----testC";
    }

    @GetMapping("/testD/{id}")
    @SentinelResource(value = "throwNum")
    public String testD(@PathVariable("id") Integer id) {
        System.out.println("id = " + id);
        if (id == 1) {
            int i = 1 / 0;
        }
        return "减库存模块----testC";
    }

    @GetMapping("/order")
    @SentinelResource(value = "hotKeys", blockHandler = "block_order")
    public String order(@RequestParam(value = "goodsId", required = false) String goodsId,
                        @RequestParam(value = "userId", required = false) String userId) {
        int i = 1 / 0;
        return "用户下单成功";
    }

    public String block_order(
            @RequestParam(value = "goodsId", required = false) String goodsId,
            @RequestParam(value = "userId", required = false) String userId,
            BlockException ex) {
        //记录错误日志
        //logger.error(ex.getMessage()))
        return "用户下单失败，请稍后重试";
    }

    @GetMapping("/resume/{id}")
    @SentinelResource(
            value = "resume",
            blockHandler = "resumeBlockHandler",
            fallback = "resumeFallback")
    public String resume(@PathVariable(value = "id", required = false) Integer id) {
        if (id <= 0) {
            throw new RuntimeException("非法的goodsId");
        }
        return "减库存成功";
    }

    public String resumeBlockHandler(
            @PathVariable("id") Integer id,
            BlockException ex) {
        return "限流问题-" + id + "---" + ex.getMessage();
    }

    public String resumeFallback(
            @PathVariable("id") Integer id,
            Throwable ex) {
        return "业务异常-" + id + "---" + ex.getMessage();
    }


}
