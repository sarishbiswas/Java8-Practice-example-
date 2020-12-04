package Streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {
    public static void main(String[] args) {
        /**
         * of() example
         * */
        Stream.of("ani","nisha","nilu").forEach(System.out::println);

        /**
         * iterate() Example
         * */
        Stream.iterate(1,x->x*2).limit(10).forEach(System.out::println);

        /***
         * generate() example
         */
        Stream.generate(()->new Random().nextInt()).limit(10).forEach(System.out::println);
    }
}
