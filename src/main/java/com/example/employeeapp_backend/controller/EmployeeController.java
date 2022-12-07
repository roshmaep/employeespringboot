package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.dao.EmployeeDao;
import com.example.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

   @Autowired
   private EmployeeDao dao;
   @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> EmployeeAdd(@RequestBody Employee e)
    {

        System.out.println(e.getName().toString());
        System.out.println(e.getCode());
        System.out.println(e.getCmpname().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getMobileno().toString());
        System.out.println(e.getPassword().toString());
        System.out.println(e.getSalary().toString());
        System.out.println(e.getUsername().toString());
        dao.save(e);
        HashMap <String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List <Employee> EmployeeView(){
        return(List<Employee>) dao.findAll();
    }

}
