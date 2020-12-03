package MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String,String> lambda = s -> s.toUpperCase();
    static Function<String,String> methodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(lambda.apply("anindita"));
        System.out.println(methodReference.apply("ani"));
    }
}
