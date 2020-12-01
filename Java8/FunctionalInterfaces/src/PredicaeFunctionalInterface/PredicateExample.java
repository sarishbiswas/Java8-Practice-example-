package PredicaeFunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate1 = (integer -> integer%2==0);
    static Predicate<Integer> predicate2 = (integer -> integer%5==0);

    public static void predicateAndTest(){
        System.out.println(predicate1.and(predicate2).test(10));
        System.out.println(predicate1.and(predicate2).test(8));
    }
    public static void predicateOrTest(){
        System.out.println(predicate1.or(predicate2).test(10));
        System.out.println(predicate1.or(predicate2).test(8));
    }
    public static void predicateNegateTest(){
        System.out.println(predicate1.or(predicate2).negate().test(10));
        System.out.println(predicate1.and(predicate2).negate().test(8));
    }

    public static void main(String[] args) {
        System.out.println(predicate1.test(10));
        predicateAndTest();
        predicateOrTest();
        predicateNegateTest();
    }
}
