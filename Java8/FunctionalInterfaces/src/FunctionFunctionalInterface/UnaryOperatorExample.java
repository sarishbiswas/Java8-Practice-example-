package FunctionFunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("anindita"));
    }
}
