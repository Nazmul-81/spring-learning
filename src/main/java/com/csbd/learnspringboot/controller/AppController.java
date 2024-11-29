package com.csbd.learnspringboot.controller;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/test")
public class AppController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello World";
    }

    @GetMapping("/constrain/{id}")
    public String constrainTest(@PathVariable @Positive @Max(5) int id){
        return "OK";
    }
}
