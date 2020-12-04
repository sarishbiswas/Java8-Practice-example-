package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsExample1 {
    public static void main(String[] args) {
        /**
         * Get A Studentmap Based on Filter Criteria
         * */
        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                                            .stream()
                                            .filter(studentPredicate)
                                            .filter(student -> student.getGpa()>=3.9)
                                            .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
