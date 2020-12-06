package StreamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgIntExample {
    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoOfBooks));
    }
    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoOfBooks));
    }
    public static void main(String[] args) {
        System.out.println("Sum of notebooks: "+sum());
        System.out.println("Average of Notebooks: "+average());
    }
}
