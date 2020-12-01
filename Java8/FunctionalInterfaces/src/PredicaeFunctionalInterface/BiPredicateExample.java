package PredicaeFunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BiPredicateExample {
    static BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)-> gradeLevel>=3 && gpa>= 3.9;
    static BiConsumer<String , List<String>> biConsumer = (name, activities)-> System.out.println(name+" : "+activities);
    static Consumer<Student> studentConsumer = (student)->{
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            biConsumer.accept(student.getName(),student.getActivities());
        }
    };
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }
}

