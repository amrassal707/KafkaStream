package com.SpringCloud.KafkaStream.Binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProducerChannels {
    @Output("producer-out-0")
    MessageChannel outbound();
}