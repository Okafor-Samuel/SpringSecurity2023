package com.example.springsecure.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/admin")
public class AdminController {

    @GetMapping("/")
    public String hello(){
        return "Admin access level";
    }
}
