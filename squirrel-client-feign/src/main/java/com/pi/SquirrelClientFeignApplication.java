package com.pi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class SquirrelClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelClientFeignApplication.class, args);
    }

}
