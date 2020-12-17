package Test;
public class LongestSubsequence {
    public static void main(String[] args) {
//        int [] arr = {2,3,1,4,6,3,8,9,2};
//        int [] arr = {1};
//        int [] arr = {1,2,3,4};
        int [] arr = {};
        int count=0,max=0;
        if(arr.length==0)
            System.out.println("The maximum length is: 0");
        else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    if (count > max) {
                        max = count;
                    }
                    count = 0;
                } else {
                    count++;
                }
            }
            System.out.println("The maximum length is: " + (max < count ? count + 1 : max + 1));
        }
    }
}
