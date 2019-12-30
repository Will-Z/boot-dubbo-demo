package com.zmxy.serviceconsumer;

import com.zmxy.api.service.Calc;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubbo
@SpringBootApplication
public class ServiceConsumerApplication {

    @Reference(version="1.0.0")
    Calc calc;

    private int doCalc(int num) {
        return calc.doubl(10);
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ServiceConsumerApplication.class, args);
        ServiceConsumerApplication application = context.getBean(ServiceConsumerApplication.class);

        int ans = application.calc.doubl(10);
        System.out.println("[consumer] " + ans);


    }

}
