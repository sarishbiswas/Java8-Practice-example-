package NumericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(integerList.stream()
                .reduce(0,(a,b)->a+b));
        System.out.println(IntStream.rangeClosed(1,6)
                            .sum());
    }
}
