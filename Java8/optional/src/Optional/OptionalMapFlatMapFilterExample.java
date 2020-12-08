package Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapFilterExample {

    public static void filter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudent.get());
        studentOptional.filter(student-> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }
    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudent.get());
        if(studentOptional.isPresent()){
            Optional<String> nameOptional= studentOptional.
                    map(Student::getName); //
            System.out.println("nameOptional : " + nameOptional);
        }
    }
}
