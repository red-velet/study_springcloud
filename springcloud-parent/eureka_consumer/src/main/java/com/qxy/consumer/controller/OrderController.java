package com.qxy.consumer.controller;

import com.qxy.consumer.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 19:02
 * @Introduction:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/add/{id}")
    public Goods add(@PathVariable("id") Integer id) {
        //业务逻辑
        //1查询商品
        //2减库存
        //3支付
        //4物流
        //远程调用提供订单号里面的商品id,查询商品的详细信息
        //该url是硬编码
        //String providerUrl = "http://localhost:8000/goods/findById/"+id;
        //Goods goods = restTemplate.getForObject(providerUrl, Goods.class);
        //修改为eureka的发现客户端
        //List<ServiceInstance> instances = discoveryClient.getInstances("EUREKA-PROVIDER");
        //if (instances == null || instances.size() <= 0) {
        //    return null;
        //}
        //ServiceInstance instance = instances.get(0);
        //String host = instance.getHost();
        //int port = instance.getPort();
        //String providerUrl = "http://" + host + ":" + port + "/goods/findById/" + id;
        //System.out.println("providerUrl = " + providerUrl);

        String providerUrl = "http://EUREKA-PROVIDER/goods/findById/" + id;
        Goods goods = restTemplate.getForObject(providerUrl, Goods.class);
        return goods;
    }
}
