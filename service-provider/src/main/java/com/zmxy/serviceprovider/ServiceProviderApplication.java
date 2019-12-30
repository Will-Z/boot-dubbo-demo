package com.zmxy.serviceprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

@EnableDubbo
@SpringBootApplication
public class ServiceProviderApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiceProviderApplication.class, args);

        System.out.println("provider stated");
        new CountDownLatch(1).await();
    }

}
