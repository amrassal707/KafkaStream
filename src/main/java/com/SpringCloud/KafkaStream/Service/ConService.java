package com.SpringCloud.KafkaStream.Service;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ConService {


    @Bean
    public Consumer<String> consumer() {
        return this::handleEvent;
    }
    public void handleEvent(String message) {
        System.out.println(message);
    }
}
