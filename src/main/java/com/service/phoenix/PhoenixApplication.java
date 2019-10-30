package com.service.phoenix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication
public class PhoenixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoenixApplication.class, args);
    }
}
