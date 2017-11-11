package com.lmonkiewicz.contracts.server;

import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Override
    public Message login(String name) {
        return Message.builder().message("Hello "+name).build();
    }
}
