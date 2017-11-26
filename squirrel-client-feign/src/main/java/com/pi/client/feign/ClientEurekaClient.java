package com.pi.client.feign;

import com.pi.client.feign.hystrix.ClientEurekaClientHystrix;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "pi-client-eureka", fallback = ClientEurekaClientHystrix.class)
@Qualifier("clientEurekaClient")
public interface ClientEurekaClient {

    @GetMapping("/services")
    String getServices();

}
