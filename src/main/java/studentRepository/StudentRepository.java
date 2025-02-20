package studentRepository;

import entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    public Map<Long, Student> students() {
        Map<Long, Student> students = new HashMap<>();

        Student student1 = new Student("John", "Doe", 20);
        Student student2 = new Student("Jane", "Smith", 22);
        Student student3 = new Student("Alice", "Johnson", 21);
        Student student4 = new Student("Bob", "Williams", 23);
        Student student5 = new Student("Charlie", "Brown", 19);
        Student student6 = new Student("David", "Jones", 24);
        Student student7 = new Student("Emily", "Miller", 20);
        Student student8 = new Student("Frank", "Davis", 22);
        Student student9 = new Student("Grace", "Garcia", 21);
        Student student10 = new Student("Henry", "Martinez", 23);

        students.put(student1.getStudentId(), student1);
        students.put(student2.getStudentId(), student2);
        students.put(student3.getStudentId(), student3);
        students.put(student4.getStudentId(), student4);
        students.put(student5.getStudentId(), student5);
        students.put(student6.getStudentId(), student6);
        students.put(student7.getStudentId(), student7);
        students.put(student8.getStudentId(), student8);
        students.put(student9.getStudentId(), student9);
        students.put(student10.getStudentId(), student10);

        return students;
    }

    public Map<Long, Student> getStudents(){
        return students();
    }

    public Student getStudentById(Long studentId) {
        return students().get(studentId);
    }

}
