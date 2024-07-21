package com.SpringCloud.KafkaStream.Service;

import com.SpringCloud.KafkaStream.Domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class ProdService {

    @Autowired
    private StreamBridge streamBridge;
    @Value("${spring.cloud.stream.bindings.producer-out-0.destination}")
    private String bindingName;


    public void sendMessageToBroker(Order message) {
            streamBridge.send(bindingName,message);
    }

}
