package com.example.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MakeFeignCalls implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        ApplicationContext applicationContext = applicationReadyEvent
                .getApplicationContext();

        TestFeignClient testFeignClient = applicationContext.getBean(TestFeignClient.class);

        testFeignClient.getPosts("test");
    }
}
