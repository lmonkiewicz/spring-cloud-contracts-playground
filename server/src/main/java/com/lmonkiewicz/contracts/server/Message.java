package com.lmonkiewicz.contracts.server;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private String message;
}
