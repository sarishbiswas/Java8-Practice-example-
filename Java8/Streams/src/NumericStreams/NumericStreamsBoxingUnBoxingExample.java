package NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnBoxingExample {
    public static List<Integer> boxingMethod(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }
    public static int unBoxingMethod(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> boxedValues = boxingMethod();
        System.out.println(boxedValues);
        System.out.println(unBoxingMethod(boxedValues));
    }
}
