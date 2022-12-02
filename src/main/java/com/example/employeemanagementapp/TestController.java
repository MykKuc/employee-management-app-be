package com.example.employeemanagementapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getOkResponse(){
        return "OK. This works.";
    }
}
