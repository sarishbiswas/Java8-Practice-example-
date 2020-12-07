package ParallelStreams;
import data.Student;
import data.StudentDataBase;
import java.util.List;
import java.util.stream.Collectors;

public class parallelStreamsExample2 {
    public static void sequentialStudentActivities(){
        long start = System.currentTimeMillis();
        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Sequential : "+(end-start));
    }
    public static void parallelStudentActivities(){
        long start = System.currentTimeMillis();
        StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Parallel : "+(end-start));
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        sequentialStudentActivities();
        parallelStudentActivities();
    }
}
