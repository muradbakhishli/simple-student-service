package entity;

public class Student {

    private static Long id = 0L;
    private Long studentId;
    private String name;
    private String surname;
    private int age;

    {
        id++;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Student(String name, String surname, int age) {
        this.studentId = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


}
