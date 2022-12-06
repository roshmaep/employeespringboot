package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String EmployeeAdd(@RequestBody Employee e)
    {

        System.out.println(e.getName().toString());
        System.out.println(e.getCode());
        System.out.println(e.getCmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getMobileno().toString());
        System.out.println(e.getPassword().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getUsername().toString());
        return "Employee added succesfully";
    }

}
