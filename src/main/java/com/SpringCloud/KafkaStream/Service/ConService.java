package com.SpringCloud.KafkaStream.Service;

import com.SpringCloud.KafkaStream.Binding.ConsumerChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
@EnableBinding(ConsumerChannels.class)
public class ConService {

    // getting the binding interface channel that this consumer will subscribe for
    @StreamListener("consumer-in-0")
    public void handleEvent(String message){
        System.out.println(message);
    }
}
