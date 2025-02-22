package com.example.demo.spring.app.studentController;

import com.example.demo.spring.app.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.spring.app.studentService.StudentService;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public Map<Long, Student> getStudents() {
        return studentService.getStudents();
    }


    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

}
