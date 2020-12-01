package ConsumerFunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student)-> System.out.println(student.getName());
    static Consumer<Student> c4 = (student)-> System.out.println(student.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printName(){
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){
        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesWithCondition(){
        studentList.forEach((student)->{
            if (student.getGradeLevel()>=3) {
                c3.andThen(c4).accept(student);
            }
        });
    }

    public static void main(String[] args) {
//        printName();
//        printNameAndActivities();
        printNameAndActivitiesWithCondition();
    }
}
