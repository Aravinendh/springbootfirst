package com.example.demo.controllers;


import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    EmployeeService es;


    @GetMapping
    public List<Employee> getEmployees(){
        return es.getEmployees();
    }


    //    @PathVariable - getting the data from the path/url
//    get by employee Id
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return es.getEmployeeById(id);
    }


    @GetMapping("/job/{job}")
    public List<Employee> getEmployeesByJob(@PathVariable String job){
        return es.getEmployeeByJob(job);
    }


    @GetMapping("/name/{name}")
    public List<Employee> getEmployeesByName(@PathVariable String name){
        return es.getEmployeeByName(name);
    }


    //    @RequestBody binds HTTP request body content to a Java object.
//    post - adding data
    @PostMapping
    public String addEmployee(@RequestBody Employee emp){
        return es.addEmployee(emp);
    }


    //    put - update data
    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee emp){
        return es.updateEmployee(id,emp);
    }

    @DeleteMapping
    public String deleteEmployees(){
        return es.deleteEmployees();
    }

    //    delete - delete data
    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return es.deleteEmployeeById(id);
    }
}