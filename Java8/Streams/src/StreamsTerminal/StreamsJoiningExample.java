package StreamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static String joining1(List<Student> students){
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    public static String joining2(List<Student> students){
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(" , ","(",")"));
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(joining1(studentList));
        System.out.println(joining2(studentList));
    }
}
