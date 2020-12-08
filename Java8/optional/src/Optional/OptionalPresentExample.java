package Optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("hello");
        //isPresent
        if(stringOptional.isPresent())
            System.out.println(stringOptional.get());
        else
            System.out.println("No record available");
        //ifPresent
        stringOptional.ifPresent(s -> System.out.println(s));
    }
}
