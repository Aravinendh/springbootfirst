package com.example.demo.repository;

import com.example.demo.models.Employee;
import com.example.demo.models.RegisterDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findById(int id);

    //    List<Employee> findByJob(String job);
    List<Employee> findByName(String name);

}