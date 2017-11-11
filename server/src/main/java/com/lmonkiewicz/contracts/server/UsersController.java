package com.lmonkiewicz.contracts.server;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping("/login")
    public Message login() {
        return Message.builder().message("Hello user").build();
    }


    @Data
    @Builder
    static class Message {
        private String message;
    }
}
