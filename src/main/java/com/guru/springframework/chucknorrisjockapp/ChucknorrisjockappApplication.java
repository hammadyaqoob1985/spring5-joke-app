package com.guru.springframework.chucknorrisjockapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class ChucknorrisjockappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChucknorrisjockappApplication.class, args);
    }
}
