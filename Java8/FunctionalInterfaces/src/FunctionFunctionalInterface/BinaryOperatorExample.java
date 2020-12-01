package FunctionFunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (a,b)->a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> b1 = (a,b)->a*b;
        System.out.println(b1.apply(4,5));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("MaxBy Result : " + maxBy.apply(4,5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy((comparator));
        System.out.println("MinBy result : " + minBy.apply(4,5));
    }
}
