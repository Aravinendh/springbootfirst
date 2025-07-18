package com.example.demo.controllers;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/id/{empId}")
    public String assignTaskById(@PathVariable int empId, @RequestBody Task task) {
        return taskService.assignTaskById(empId, task);
    }

    @GetMapping("/id/{empId}/tasks")
    public List<Task> getTasks(@PathVariable int empId) {
        return taskService.getTasksByEmployeeId(empId);
    }
}
