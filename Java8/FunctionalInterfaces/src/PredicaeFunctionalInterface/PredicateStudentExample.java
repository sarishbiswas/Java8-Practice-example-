package PredicaeFunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> p2 = (student -> student.getGpa()>=3.9);
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentByGradeLevel(){
        System.out.println("FilterStudentsByGradeLevel");
        studentList.forEach((student) -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentByGpa(){
        System.out.println("FilterStudentsByGpa");
        studentList.forEach((student) -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudents(){
        System.out.println("FilterStudents");
        studentList.forEach((student) -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}
