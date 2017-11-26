package com.pi.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class SquirrelClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelClientEurekaApplication.class, args);
    }

}
