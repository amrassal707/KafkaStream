package com.SpringCloud.KafkaStream.Service;

import java.util.function.Consumer;

import com.SpringCloud.KafkaStream.Domain.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class ConService {


    //this::handleEvent is a method reference that refers to the handleEvent method. This means that when the Consumer receives a message, it will pass that message to the handleEvent method for processing.
    @Bean
    public Consumer<Message<Order>> consumer() {
        return this::handleEvent;
    }

    public void handleEvent(Message<Order> message) {
        System.out.println("in consumer " + message.getPayload().toString());
    }
}
