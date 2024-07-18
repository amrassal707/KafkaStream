package com.SpringCloud.KafkaStream.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class ProdService {


    @Autowired
    private StreamBridge streamBridge;


    public void SendMessageToBroker(String message) {
        streamBridge.send("producer-out-0", message);
    }

}
