package NumericStreams;

import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1,6).count());
        System.out.println(IntStream.rangeClosed(1,6).count());

        System.out.println(LongStream.range(1,6).sum());
        System.out.println(LongStream.rangeClosed(1,6).sum());
        IntStream.rangeClosed(1,6)
                .asDoubleStream()
                .forEach(System.out::println);
    }
}
