package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping("/")
    public String Welcomepage(){
        return "welcome to employee page";
    }
    @PostMapping("/add")
    public String Employeeadd(){
        return "Employee add";
    }
    @PostMapping("/search")
    public String Employeesearch(){
        return "Employee Search";
}
    @PostMapping("/edit")
    public String Employeeedit(){
        return "Employee Edit";
    }
    @GetMapping("/viewall")
    public String Employeeview(){
        return "View all employee";
    }
    @PostMapping("/delete")
    public String Employeedelete(){
        return "Employee delete";
    }
}
