package com.qxy.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 8:32
 * @Introduction:
 */
@Component
@EnableBinding(Source.class)//这个类是stream的发送者
public class MessageProducer {
    @Autowired
    MessageChannel output;

    public void send(String msg) {
        output.send(MessageBuilder.withPayload(msg).build());
    }
}
