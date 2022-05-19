package com.engineeringwithramaa.beanvalidationandexceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.engineeringwithramaa.beanvalidationandexceptionhandling")
public class BeanvalidationandexceptionhandlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanvalidationandexceptionhandlingApplication.class, args);
    }

}
