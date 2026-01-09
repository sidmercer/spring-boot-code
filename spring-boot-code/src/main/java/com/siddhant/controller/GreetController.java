package com.siddhant.controller;

import com.siddhant.dto.GreetResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/hello")
    public GreetResponse greet() {
        return new GreetResponse("Hello Siddhant", 200);
    }
}
