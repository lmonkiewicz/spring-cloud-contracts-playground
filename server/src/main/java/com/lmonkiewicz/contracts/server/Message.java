package com.lmonkiewicz.contracts.server;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Message {
    private String message;
}
