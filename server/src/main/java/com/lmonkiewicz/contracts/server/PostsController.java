package com.lmonkiewicz.contracts.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostsController {

    @GetMapping("/list")
    public List<String> list() {
        return Arrays.asList("First", "Second", "Third", "Fourth");
    }
}
