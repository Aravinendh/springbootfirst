package com.example.demo.services;

import com.example.demo.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees=new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public String createEmployee(Employee employee){
        boolean res= employees.add(employee);
        if(res){
            return "Employee Added Successfully!\n"+ employee.toString();
        }else{
            return "Failed to Create Employee";
        }
    }
}