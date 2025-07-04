package com.example.demo.services;
import com.example.demo.models.Student;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student(1, "Student1", "Python+DS"),
                new Student(2, "Student2", "DataScience"),
                new Student(3, "Student3", "ComputerScience")
        );
    }
}