package com.example.controller;

import com.example.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String getLoginUI(){
        return "login";
    }

    @PostMapping("/login")
    public String checkLogin(Users users){
        return "login";
    }
}
