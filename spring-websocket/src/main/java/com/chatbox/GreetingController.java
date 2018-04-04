package com.chatbox;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {


    @MessageMapping("/message")
    @SendTo("/topic/post")
    public Post greeting(Message message) throws Exception {
        return new Post(message.getTextMessage());
    }

}
