package com.pi.client.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class HomeEndpoint {

    private final Random random = new Random(System.currentTimeMillis());

    /**
     模拟连接超时的情况，触发熔断器生效调用 homeFallback()
     */
    @GetMapping("/pi")
    @HystrixCommand(fallbackMethod = "homeFallback", commandProperties = { @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000") })
    public String home() throws InterruptedException {
        Thread.sleep(random.nextInt(2000));
        return "hi ~ \r\n" + new Date();
    }

    public String homeFallback() {
        return "有事烧纸，没事莫吵";
    }

}
