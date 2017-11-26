package com.pi.client.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class SquirrelCloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SquirrelCloudConfigClientApplication.class, args);
    }

}
