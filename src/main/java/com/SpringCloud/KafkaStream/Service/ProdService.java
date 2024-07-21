package com.SpringCloud.KafkaStream.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

@Service
public class ProdService {

    @Autowired
    private StreamBridge streamBridge;
    @Value("${spring.cloud.stream.bindings.producer-out-0.destination}")
    private String bindingName;


    public void sendMessageToBroker(String message) {
            streamBridge.send(bindingName,message);
    }

}
