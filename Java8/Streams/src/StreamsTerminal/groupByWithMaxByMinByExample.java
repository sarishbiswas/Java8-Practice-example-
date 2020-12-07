package StreamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class groupByWithMaxByMinByExample {
    public static void groupMaxBy(){
        Map<String, Optional<Student>>students;
        students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender
                        ,maxBy(comparing(Student::getGpa))));
        System.out.println(students);
    }
    public static void groupMaxByWithoutOptional(){
        Map<String, Student>students;
        students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender
                        ,collectingAndThen(maxBy(comparing(Student::getGpa)),Optional::get)));
        System.out.println(students);
    }
    public static void groupMinByWithoutOptional(){
        Map<String, Student>students;
        students = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender
                        ,collectingAndThen(minBy(comparing(Student::getGpa)),Optional::get)));
        System.out.println(students);
    }
    public static void main(String[] args) {
        groupMaxBy();
        groupMaxByWithoutOptional();
        groupMinByWithoutOptional();
    }
}
