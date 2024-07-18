package com.SpringCloud.KafkaStream.Binding;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerChannels {
    @Input("consumer-in-0")
    SubscribableChannel inbound();
}
