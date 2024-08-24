package com.SpringCloud.KafkaStream.Service;

import java.util.function.Consumer;

import com.SpringCloud.KafkaStream.Domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConService {

    //this::handleEvent is a method reference that refers to the handleEvent method. This means that when the Consumer receives a message, it will pass that message to the handleEvent method for processing.
    @Bean
    public Consumer<Message<Order>> consumer() {
        return this::handleEvent;
    }


    public void handleEvent(Message<Order> message) {


        try {

            // example that we can't process any order with id = 1
            if(message.getPayload().getOrder_id().equals("1")){
                throw new RuntimeException("Failed to process order with ID 1");
            }
        }
        catch (Exception e){
            // If an error occurs, send the message to the DLQ
            System.out.println("consumer failed to process the message: " + message);
            throw e;// to trigger DLQ
        }

    }



}
