package Optional;

import java.util.Optional;

public class OptionalOfEmptyOfNullableExample {
    public static Optional<String> ofNullable(){
        //Used when we do not know wheather the object will return null or not.
        return Optional.ofNullable("Hello");
    }
    public static Optional<String> of(){
        //Used when we are certain that the object will not return null.
        return Optional.of("Hello");
    }
    public static Optional<String> empty(){
        //Used when we are certain that the object will not return null.
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println("ofNullable : "+ofNullable());
        System.out.println("of : "+of());
        System.out.println("empty : "+empty());
    }
}
