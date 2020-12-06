package StreamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCountingExample {
    public static long countingTest(List<Student> students){
        return students.stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(countingTest(studentList));
    }
}
