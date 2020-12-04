package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
    public static Optional<Integer> limitExample(List<Integer> integers){
        return integers.stream()
                .limit(4)
                .reduce(Integer::sum);
    }
    public static Optional<Integer> skipExample(List<Integer> integers){
        return integers.stream()
                .skip(3)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,1,8,7,10);
        Optional<Integer> limitVar = limitExample(integerList);
        System.out.println(limitVar.isPresent()?limitVar.get():"List is Empty");
        Optional<Integer> skipVar = skipExample(integerList);
        System.out.println(skipVar.isPresent()?skipVar.get():"List is Empty");

    }
}
