package com.leekyoungil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.leekyoungil"})
@SpringBootApplication
@EnableAutoConfiguration
public class CsclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsclientApplication.class, args);
    }
}
