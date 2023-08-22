package com.example.springsecure.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping ("/hello")
    public String hello(){
        return "user access level";
    }
}
