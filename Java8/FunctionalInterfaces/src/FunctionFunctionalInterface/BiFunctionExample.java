package FunctionFunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static Predicate<Double> doublePredicate = (gpa)->gpa>=3.9;
    static BiFunction<List<Student>, Predicate<Double>, Map<String,Double>> biFunction = (students, doublePredicate) ->{
      Map<String,Double> map = new HashMap<>();
      students.forEach(student ->{
          if (doublePredicate.test(student.getGpa()))
              map.put(student.getName(),student.getGpa());
      } );
      return map;
    };
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),doublePredicate));
    }
}
