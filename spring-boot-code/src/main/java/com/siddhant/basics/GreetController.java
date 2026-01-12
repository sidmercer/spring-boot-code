package com.siddhant.basics;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/basics")
public class GreetController {
    //This demonstrates how to build REST APIs using Spring Boot and return different types of responses.
    //1 - API 1: Simple GET endpoint that returns a plain text response
    @GetMapping("/")
    public String Greet(){
        return "Hello this is the first API !!";
    }

    //2 - API 2: GET endpoint that returns a JSON response using a record
    @GetMapping("/greet")
    public GreetResponse Greet1(){
        return new GreetResponse("Hello",200);
    }

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
}
