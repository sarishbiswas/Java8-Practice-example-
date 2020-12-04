package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceMaxMinExample {
    public static Optional<Integer> findMaxValue(List<Integer> integers){
        return integers.stream()
                .reduce(Integer::max);
//                .reduce((a,b)-> a > b ? a : b);
    }
    public static Optional<Integer> findMinValue(List<Integer> integers){
        return integers.stream()
//                .reduce(Integer::min);
                .reduce((a,b)-> a < b ? a : b);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,5,1,8,7,10);
        Optional<Integer> maxVal = findMaxValue(integerList);
        System.out.println(maxVal.isPresent() ? maxVal.get():"List is Empty.");
        Optional<Integer> minVal = findMinValue(integerList);
        System.out.println(minVal.isPresent() ? minVal.get():"List is Empty.");
    }
}
