package ConsumerFunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String,List<String>> biConsumer = (name,activities)->System.out.println(name+" : "+activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> multiply1 = (a,b)-> System.out.println("Multiply : "+ a*b);
        multiply1.accept(7,5);

        BiConsumer<Integer,Integer> add = (a,b)-> System.out.println("Addition : "+ (a+b));
        BiConsumer<Integer,Integer> subtract = (a,b)-> System.out.println("Subtraction : "+ (a-b));
        BiConsumer<Integer,Integer> multiply = (a,b)-> System.out.println("Multiplication : "+ a*b);
        BiConsumer<Integer,Integer> divide = (a,b)-> System.out.println("Division : "+ a/b);
        //BiConsumer Chaining
        add.andThen(subtract).andThen(multiply).andThen(divide).accept(10,2);

        System.out.println("Name and Activities from Student class");
        nameAndActivities();
    }
}
