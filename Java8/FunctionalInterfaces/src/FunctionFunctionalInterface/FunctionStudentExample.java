package FunctionFunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionStudentExample {
    static Predicate<Integer> predicate = (grade)->grade>=3;
    static Function<List<Student>, Map<String,Double>> studentFunction = (students)->{
        Map<String,Double> map = new HashMap<>();
        students.forEach((student -> {
            if (predicate.test(student.getGradeLevel()))
                map.put(student.getName(),student.getGpa());
        }));
        return map;
    };
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
