package com.SpringCloud.KafkaStream.Service;


import com.SpringCloud.KafkaStream.Domain.Order;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
public class DlqHandler {

    @DltHandler
    public void handleFailedMessage(Message<Order> message, @Header("kafka_receivedTopic") String topic) {
        System.out.println("Received from DLQ topic: " + topic);
        System.out.println("Failed message: " + message.getPayload());

    }
}

