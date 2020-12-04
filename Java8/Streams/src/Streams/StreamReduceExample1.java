package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample1 {
    public static int multiply(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b)->a*b);
    }
    public static Optional<Integer> multiplyWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)->a*b);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        System.out.println(multiply(integers));
        Optional<Integer> result = multiplyWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

    }
}
