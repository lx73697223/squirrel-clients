package com.pi.client.cloudconfig.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigEndpoint {

    @Value("${from}")
    private String from;

    @GetMapping({ "/pi", "/" })
    public String from() {
        return "from = " + from;
    }

}
