package com.sarish;

import java.util.stream.IntStream;

public class ImparativeVsDeclarativeExample {
    public static void main(String[] args) {

        // sum of integers for the range from 0 to 100
        /**
         * Imperative Style - how style of programming
         */
        int sum = 0;
        for (int i = 1; i<=100 ; i++){
            sum+=i;
        }
        System.out.println("imaperative Approach Sum is: "+ sum);

        /**
         * Declarative style. (Functional programming uses the same style)
         * what style of programming.
         * You let the system do the job for you and get the result.
         */
        int sum1 = IntStream.rangeClosed(0,100)
                .sum();
        System.out.println("Declarative Approach Sum is: " + sum1);
    }
}
