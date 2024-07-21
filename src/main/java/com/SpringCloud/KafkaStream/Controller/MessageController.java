package com.SpringCloud.KafkaStream.Controller;

import com.SpringCloud.KafkaStream.Service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private ProdService prodService;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message)
    {
        prodService.sendMessageToBroker(message);
        return "Message send successfully";
    }
}
