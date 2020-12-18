package Easy.Array;

import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSumBruteForce(int[] numbers, int target) {
        int [] arr = new int[2];
        for (int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if (numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    arr[1] = j+1;
                }
            }
        }
        return arr;
    }
    public static int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]>target)
                r--;
            else if(numbers[l]+numbers[r]<target)
                l++;
            else
                return new int[] {l+1,r+1};
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        Arrays.stream(twoSum(arr,9)).forEach(System.out::println);
        Arrays.stream(twoSumBruteForce(arr,9)).forEach(System.out::println);

    }
}
