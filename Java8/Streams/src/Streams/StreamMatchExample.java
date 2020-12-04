package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamMatchExample {
    public static boolean allMatchExample(List<Student> students){
        return students.stream()
                .allMatch(student -> student.getGpa()>=3.9);
    }
    public static boolean anyMatchExample(List<Student> students){
        return students.stream()
                .anyMatch(student -> student.getGpa()>=3.9);
    }
    public static boolean noneMatchExample(List<Student> students){
        return students.stream()
                .noneMatch(student -> student.getGpa()>=3);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(allMatchExample(studentList));
        System.out.println(anyMatchExample(studentList));
        System.out.println(noneMatchExample(studentList));
    }
}
