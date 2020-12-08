package Default;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,3,5,7);
        Multiplier multiplier = new MultiplierImpl();
        System.out.println(multiplier.multiply(integerList));
        System.out.println(multiplier.size(integerList));
        Multiplier.print(integerList);
    }
}
