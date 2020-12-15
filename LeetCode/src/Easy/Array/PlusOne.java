package Easy.Array;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int l=digits.length;
        int s =1;
        for(int i=l-1;i>=0;i--){
            if(digits[i]+s==10){
                digits[i] = 0;
                s=1;
            }
            else{
                digits[i]+=s;
                s=0;
                break;
            }
        }
        if(s==0)
            return digits;
        else{
            int [] aux = new int[l+1];
            aux[0] = s;
            for(int i=0;i<l;i++){
                aux[i+1] = digits[i];
            }
            return aux;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Arrays.stream(plusOne(arr)).forEach(System.out::println);
    }
}
