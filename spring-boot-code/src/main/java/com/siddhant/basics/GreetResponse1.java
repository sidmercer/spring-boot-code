package com.siddhant.basics;

import java.util.List;

// DTO representing a complex response structure
record GreetResponse1(
        String greet,
        List<String> favProgrammingLanguages,
        Person person
){}