package com.security.controller;


import com.security.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.security.service.EmployeeService;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    public EmployeeService empservice;

    @GetMapping("/getallemp")
    public List<Employee> getEmp(){
        System.out.println("Harish Comment: getallemp() has been hit");
        return empservice.getEmpData();
    }

    @RequestMapping(value = "/addemp",consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean addEmp(@RequestBody Employee emp){
        System.out.println("Harish Comment: addemp() has been hit");
        return empservice.addEmp(emp);
    }
}
