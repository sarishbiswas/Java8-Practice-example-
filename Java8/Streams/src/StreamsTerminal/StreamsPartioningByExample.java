package StreamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartioningByExample {
    public static void partitionByExample1(){
        Predicate<Student> studentPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> booleanListMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(studentPredicate));
        System.out.println(booleanListMap);
    }

    public static void partitionByExample2(){
        Predicate<Student> studentPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> booleanListMap1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(studentPredicate
                ,toSet()));
        System.out.println(booleanListMap1);
    }
    public static void main(String[] args) {
        partitionByExample1();
        partitionByExample2();
    }
}
