package com.qxy.listener;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author: SayHello
 * @Date: 2023/3/16 8:48
 * @Introduction:
 */
@EnableBinding({Sink.class})
@Component
public class MessageListener {
    @StreamListener(Sink.INPUT)
    public void receive(Message message) {
        System.out.println(message);
        System.out.println(message.getPayload());
    }
}
