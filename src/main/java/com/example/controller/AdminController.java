package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class AdminController {

    //CRUD Employee
    @GetMapping("/employee-create")
    public String createEmployeeUI(){
        return "admin/employee/create";
    }

    @PostMapping("/employee-create")
    public String createEmployee(){
        return "admin/employee/create";
    }


}
