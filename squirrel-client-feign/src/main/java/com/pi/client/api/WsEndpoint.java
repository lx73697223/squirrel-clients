package com.pi.client.api;

import com.pi.client.feign.ClientEurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WsEndpoint {

    @Autowired
    @Qualifier("clientEurekaClient")
    private ClientEurekaClient clientEurekaClient;

    /**
     使用feign进行接口调用，返回 pi-client-eureka 服务 /services 接口返回的值
     */
    @GetMapping("/eureka/services")
    public String getEurekaServices() {
        String services = clientEurekaClient.getServices();
        return "WsEndpoint.getEurekaServices : " + services;
    }

}
