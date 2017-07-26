package com.magkbdev.weaverbot.api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WeaverbotAPIApplication {

    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WeaverbotAPIApplication.class, args);
    }
}
