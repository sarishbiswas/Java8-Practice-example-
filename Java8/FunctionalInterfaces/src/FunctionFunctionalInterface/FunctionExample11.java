package FunctionFunctionalInterface;

public class FunctionExample11 {
    public static String performConcat(String name){
        return FunctionExample1.function2.apply(name);
    }
    public static void main(String[] args) {
        System.out.println(performConcat("Anindita"));
    }
}
