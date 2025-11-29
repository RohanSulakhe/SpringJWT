package com.rohan.springauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class greetController {
    @GetMapping("/hello")
    public String greet(HttpServletRequest request){
        return "Good morning!!" + request.getSession().getId();
    }
}
