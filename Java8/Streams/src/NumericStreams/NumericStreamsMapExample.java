package NumericStreams;

import java.util.List;
import java.util.function.IntToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {
    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(Integer::new)
                .collect(Collectors.toList());
    }
    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)
                .mapToLong(i->i)
                .sum();
    }
    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble(i->i)
                .average().getAsDouble();
    }
    public static void main(String[] args) {
        System.out.println(mapToObj());
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
