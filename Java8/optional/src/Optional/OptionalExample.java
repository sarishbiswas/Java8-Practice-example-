package Optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getStudent.get());
        if (studentOptional.isPresent())
            return studentOptional.map(Student::getName);
        return Optional.empty();
    }
    public static void main(String[] args) {
        Optional<String> name = getStudentNameOptional();
        if (name.isPresent())
            System.out.println("Length of the name is : "+name.get().length());
    }
}
