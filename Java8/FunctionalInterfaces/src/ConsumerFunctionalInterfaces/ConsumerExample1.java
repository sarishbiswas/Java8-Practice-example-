package ConsumerFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        Consumer<String> str = (s) -> System.out.println(s.toUpperCase());
        str.accept("Ani");
    }
}
