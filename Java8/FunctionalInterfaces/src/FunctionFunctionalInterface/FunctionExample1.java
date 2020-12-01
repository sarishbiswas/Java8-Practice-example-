package FunctionFunctionalInterface;

import java.util.function.Function;

public class FunctionExample1 {

    static Function<String,String> function = (name)->name.toUpperCase();
    static Function<String,String> function2 = (name)->name.toUpperCase().concat(" Nandy");
    public static void main(String[] args) {
        System.out.println(function.apply("anindita"));
        System.out.println(function.andThen(function2).apply("anindita"));
        System.out.println(function.compose(function2).apply("anindita"));
    }
}
