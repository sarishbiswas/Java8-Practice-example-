package Default;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ani","Sarish","Sayani","Nisha","Praveen","Harshit");
        /**
         * prior java 8
         * */
//        Collections.sort(names);
//        System.out.println(names);

        /**
         * java 8
         * */
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
