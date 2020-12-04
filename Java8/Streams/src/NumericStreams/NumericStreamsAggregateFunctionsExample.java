package NumericStreams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateFunctionsExample {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10)
                            .sum());
        System.out.println(IntStream.rangeClosed(1,10).count());

        OptionalInt optionalInt = IntStream.rangeClosed(1,10).max();
        System.out.println(optionalInt.isPresent()?optionalInt.getAsInt():0);

        OptionalLong optionalLong = LongStream.rangeClosed(1,50).min();
        System.out.println(optionalLong.isPresent()?optionalLong.getAsLong():0);

        OptionalDouble optionalDouble = LongStream.rangeClosed(1,10).average();
        System.out.println(optionalDouble.isPresent()?optionalDouble.getAsDouble():0.0);
    }
}
