package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Welcomepage(){
        return "welcome to employee page";
    }
    @GetMapping("/add")
    public String Employeeadd(){
        return "Employee add";
    }
    @GetMapping("/search")
    public String Employeesearch(){
        return "Employee Search";
}
    @GetMapping("/edit")
    public String Employeeedit(){
        return "Employee Edit";
    }
}
