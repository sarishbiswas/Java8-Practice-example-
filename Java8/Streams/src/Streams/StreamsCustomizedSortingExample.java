package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCustomizedSortingExample {
    public static List<Student> sortByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortByNameAndGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(sortByName());
        System.out.println(sortByNameAndGpa());
    }
}
