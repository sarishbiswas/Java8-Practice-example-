package Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {
    //static Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudent.get());
    static Optional<Student> studentOptional = Optional.ofNullable(null);

    //orElse
    public static String orElse(){
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    //orElseGet
    public static String orElseGet(){
        String name = studentOptional.map(Student::getName).orElseGet(()->"Default");
        return name;
    }
    //orElseThrow
    public static String orElseThrow(){
        String name = studentOptional.map(Student::getName)
                                .orElseThrow(() -> new RuntimeException("No data Available"));
        return name;
    }
    public static void main(String[] args) {
        System.out.println("orElse : "+orElse());
        System.out.println("orElseGet : "+orElseGet());
        System.out.println("orElseThrow : "+orElseThrow());
    }
}
