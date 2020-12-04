package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class SttreamsFindAnyFirstExample {
    public static Optional<Student> findFirstExample(List<Student> students){
        return students.stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }
    public static Optional<Student> findAnyExample(List<Student> students){
        return students.stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(findFirstExample(studentList));
        System.out.println(findAnyExample(studentList));
    }
}
