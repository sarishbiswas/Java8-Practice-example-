package Default;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        return integerList.size();
    }
    static void print(List<Integer> integerList){
        integerList.stream()
                .forEach(System.out::println);
    }
}
