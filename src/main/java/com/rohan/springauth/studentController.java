package com.rohan.springauth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class studentController {
    
    List<student> students = new ArrayList<>(Arrays.asList(
        new student(1,"Rohan", "java"),
        new student(2,"johan", "c++")
    ));

    @GetMapping("/csrf-token")
    public CsrfToken getcsrf(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }
    @GetMapping("/studentinfo")
    public List<student> getStud(){
        return students;
    }

    @PostMapping("/addstudent")
    public void addstud(@RequestBody student s){
        students.add(s);
    }
}
