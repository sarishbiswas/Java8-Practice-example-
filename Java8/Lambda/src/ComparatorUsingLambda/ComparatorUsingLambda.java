package ComparatorUsingLambda;

import java.util.Comparator;

public class ComparatorUsingLambda {
    public static void main(String[] args) {
        /**
         * Using Anonymous function : prior java 8
         * */
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Comparator using anonymous Functon: prior java 8-> " + integerComparator.compare(3,2));

        /**
         * Using java 8 Lambda
         * */
        Comparator<Integer> integerComparator1 = (Integer a,Integer b) -> {
            return a.compareTo(b);
        };
        System.out.println("Comparator using java 8 lambda -> " + integerComparator1.compare(3,2));
        /**
         * Using single line Lambda
         * */
        Comparator<Integer> integerComparator2 = (a,b) -> a.compareTo(b);
        System.out.println("Comparator using single Line lambda -> " + integerComparator2.compare(3,2));
    }
}
