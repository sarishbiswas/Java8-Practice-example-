package MethodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> check = RefactorMethodReferenceExample::checkGradeLevel;
    public  static boolean checkGradeLevel(Student student){
        return student.getGradeLevel()>=3;
    }
    public static void main(String[] args) {
        System.out.println(check.test(StudentDataBase.getStudent.get()));
    }
}
