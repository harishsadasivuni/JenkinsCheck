package com.security.service;

import com.security.dao.EmployeeRepo;
import com.security.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepo emprepo;

    public List<Employee> getEmpData(){
       return  emprepo.findAll();
    }

    public boolean addEmp(Employee emp) {
        try {
            emprepo.save(emp);
            return true;
        }catch (Exception e){
            System.out.println("There is an error"+e);
        }
        return false;
    }






}
