package com.example.demo.services;

import com.example.demo.models.RegisterDetails;
import com.example.demo.models.Task;
import com.example.demo.repository.RegisterDetailsRepository;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private RegisterDetailsRepository registerDetailsRepository;

    // Assign a task to an employee
    public String assignTaskById(int empId, Task task) {
        RegisterDetails employee = registerDetailsRepository.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + empId));
        task.setAssignedEmployee(employee);
        taskRepository.save(task);
        return "Task assigned successfully to employee with id: " + empId;
    }

    // Get all tasks assigned to a specific employee
    public List<Task> getTasksByEmployeeId(int empId) {
        return taskRepository.findByAssignedEmployee_EmpId(empId);
    }
}
