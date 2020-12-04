package Streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamReduceStudentExample {
    public static Optional<Student> getStudentWithHighestGpa(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)-> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        System.out.println(getStudentWithHighestGpa().isPresent()? getStudentWithHighestGpa().get():null);
    }
}
