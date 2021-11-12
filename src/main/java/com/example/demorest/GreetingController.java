package com.example.demorest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greeting() {
        LocalDate localDate = LocalDate.now();
        return "Hello Jesper! the time is " + localDate.toString();
    }
}
