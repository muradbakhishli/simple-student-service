package com.example.demo.spring.app.entity;

public class Student {

    private static Long id = 0L;
    private final Long studentId;
    private String name;
    private String surname;
    private int age;

    {
        id++;
    }

    public Long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, String surname, int age) {
        this.studentId = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}
