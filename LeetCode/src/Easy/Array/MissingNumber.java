package Easy.Array;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum = (nums.length+1)*nums.length/2;
        int actualSum = 0;
        for(int x:nums)
            actualSum+=x;
        return sum-actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}
