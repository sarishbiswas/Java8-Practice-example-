package SupplierFunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> s1 = ()-> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        System.out.println(s1.get());

        Supplier<List<Student>> supplier = ()-> StudentDataBase.getAllStudents();
        System.out.println(supplier.get());
    }
}
