package com.pi.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaRegistryEndpoint {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping({ "/services", "/" })
    public String getServices() {
        return "EurekaRegistryEndpoint.getServices : " + discoveryClient.getServices();
    }

}
