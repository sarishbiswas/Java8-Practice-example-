package Streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceFilterExample {
    public static int noOfBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .map(Student::getNoOfBooks)
//                .reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println(noOfBooks());
    }
}
