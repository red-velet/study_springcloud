package com.qxy.controller;

import com.qxy.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 8:38
 * @Introduction:
 */
@RestController
@RequestMapping("/test")
public class MessageController {
    @Autowired
    MessageProducer messageProducer;

    @RequestMapping("send")
    public String send() {
        //业务逻辑
        //发送信息
        String msg = "hello stream!!!";
        messageProducer.send(msg);
        return "success";
    }
}
