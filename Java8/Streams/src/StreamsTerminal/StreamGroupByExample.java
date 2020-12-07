package StreamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupByExample {
    public static void groupByType1Test(){
        Map<String, List<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(map);
    }
    public static void groupByType1Test1(){
        Map<String, List<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8?"Outstanding":"Average"));
        System.out.println(map);
    }
    public static void groupByType2Test1(){
        Map<Double, Map<Integer, List<Student>>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGpa,groupingBy(Student::getNoOfBooks)));
        System.out.println(map);
    }
    public static void groupByType2Test2(){
        Map<Double, Integer> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGpa,summingInt(Student::getNoOfBooks)));
        System.out.println(map);
    }
    public static void groupByType3Test(){
        Map<Double, Set<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGpa, LinkedHashMap::new,toSet()));
        System.out.println(map);
    }
    public static void main(String[] args) {
        groupByType1Test();
        groupByType1Test1();
        groupByType2Test1();
        groupByType2Test2();
        groupByType3Test();
    }

}
