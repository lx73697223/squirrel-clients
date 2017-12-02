package com.pi.client.feign;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "pi-client-eureka", fallback = ClientEurekaClientHystrix.class)
@Qualifier("clientEurekaClient")
public interface ClientEurekaClient {

    @GetMapping("/services")
    String getServices();

}

@Component
class ClientEurekaClientHystrix implements ClientEurekaClient {

    @Override
    public String getServices() {
        return "ClientEurekaClientHystrix.getServices fallback";
    }

}
