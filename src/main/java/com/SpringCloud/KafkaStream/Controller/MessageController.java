package com.SpringCloud.KafkaStream.Controller;

import com.SpringCloud.KafkaStream.Domain.Order;
import com.SpringCloud.KafkaStream.Service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private ProdService prodService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody Order message)
    {
        prodService.sendMessageToBroker(message);
        return "Message send successfully";
    }
}
