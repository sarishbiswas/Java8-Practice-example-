package Default;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ComparatorSortExample {

    static Consumer<Student> studentConsumer = student -> System.out.println(student);

    public static void sortByName(List<Student> studentList){
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    public static void sortByGpa(List<Student> studentList){
        Comparator<Student> studentComparator = Comparator.comparing(Student::getGpa);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }
    public static void sortByGpaThenName(List<Student> studentList){
        Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(gpaComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }
    //nullsFirst() or nullsLast()
    public static void sortByNameWithNullCheck(List<Student> studentList){
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
//        Comparator<Student> nullComparator = Comparator.nullsFirst(nameComparator);
        Comparator<Student> nullComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(nullComparator);
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
//        sortByGpaThenName(StudentDataBase.getAllStudents());
//        sortByName(StudentDataBase.getAllStudents());
        sortByNameWithNullCheck(StudentDataBase.getAllStudents());
    }
}
