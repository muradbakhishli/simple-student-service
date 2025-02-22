package com.example.demo.spring.app.studentService;


import com.example.demo.spring.app.entity.Student;
import org.springframework.stereotype.Service;
import com.example.demo.spring.app.studentRepository.StudentRepository;

import java.util.Map;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Map<Long, Student> getStudents() {
        return studentRepository.getStudents();
    }

    public Student getStudentById(Long studentId) {
        return studentRepository.getStudentById(studentId);
    }
}
