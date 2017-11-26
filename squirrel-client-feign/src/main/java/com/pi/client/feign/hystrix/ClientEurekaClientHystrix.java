package com.pi.client.feign.hystrix;

import com.pi.client.feign.ClientEurekaClient;
import org.springframework.stereotype.Component;

@Component
public class ClientEurekaClientHystrix implements ClientEurekaClient {

    @Override
    public String getServices() {
        return "ClientEurekaClientHystrix.getServices fallback";
    }

}
