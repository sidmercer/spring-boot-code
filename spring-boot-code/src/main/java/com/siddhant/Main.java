package com.siddhant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args){
//        System.out.println("Hello, SpringBoot started!!");
        SpringApplication.run(Main.class, args);
    }

}
