package com.siddhant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args){
//        System.out.println("Hello, SpringBoot started!!");
        SpringApplication.run(Main.class, args);
    }
//1
    @GetMapping("/")
    public String Greet(){
       return "Hello this is the first API !!";
    }
//2
    @GetMapping("/greet")
    public GreetResponse Greet1(){
        return new GreetResponse("Hello");
    }

    record GreetResponse(String greet){}




}
