package Easy.Array;

public class FibonacciNumber {
    public static int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int f0 = 0;
        int f1=1;
        while(n>=2){
            int temp = f0+f1;
            f0=f1;
            f1=temp;
            n--;
        }
        return f1;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
