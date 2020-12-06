package StreamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {
    public static Optional<Student> min_By(List<Student> students){
        return students.stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> max_By(List<Student> students){
        return students.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(min_By(studentList));
        System.out.println(max_By(studentList));
    }
}
