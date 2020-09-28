package com.sprinmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Author : aa
 * @CreateTime : 2020/9/7
 @Description :主题交换机(Topic Exchange)
 **/

@Component
@RabbitListener(queues = "topic.woman")
public class TopicWomanReceiver {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("TopicTotalReceiver消费者收到消息  : " + testMessage.toString());
    }
}
