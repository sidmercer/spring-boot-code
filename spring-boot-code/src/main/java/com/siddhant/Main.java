package com.siddhant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args){
//        System.out.println("Hello, SpringBoot started!!");
        SpringApplication.run(Main.class, args);
    }
    //This demonstrates how to build REST APIs using Spring Boot and return different types of responses.
//1 - API 1: Simple GET endpoint that returns a plain text response
    @GetMapping("/")
    public String Greet(){
       return "Hello this is the first API !!";
    }
//2 - API 2: GET endpoint that returns a JSON response using a record
    @GetMapping("/greet")
    public GreetResponse Greet1(){
        return new GreetResponse("Hello");
    }
    // DTO (Data Transfer Object) for simple greeting response
    record GreetResponse(String greet){}

    //3 - // API 3: GET endpoint that returns a complex JSON response
       // containing a greeting message, list, and nested object
    @GetMapping("/greet1")
    public GreetResponse1 greet2(){
        GreetResponse1 response = new GreetResponse1(
                "Hello",
                List.of("Java","GoLang","JavaScript"),
                new Person("siddhant",24)
        );
        return response;
    }
    // Represents a Person object used in API response
    record Person(String name,int age){}
    // DTO representing a complex response structure
    record GreetResponse1(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){}


}
