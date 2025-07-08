package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    //Service layer
    @Autowired
    private EmployeeService es;


    @PostMapping
    public String addEmployee(@RequestBody Employee e){
        return String.valueOf(es.addEmployee(e.getName(), e.getRole()));
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return es.getAllEmployees();
    }

    @GetMapping("/{eid}")
    public Employee getEmployeeById(@PathVariable int eid){
        return es.getEmployeeById(eid);
    }

    @GetMapping("/job/{job}")
    public Employee getEmployeeByJob(@PathVariable String job){
        return es.getEmployeeByJob(job);
    }

    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable int eid){
        return es.deleteEmployeeById(eid);
    }

    @DeleteMapping
    public String deleteAllEmployee(){
        return es.deleteAllEmployee();
    }

    @PutMapping("/{eid}")
    public String updateRecord(@RequestBody Employee employee){
        return es.updateRecord(employee);
    }
}