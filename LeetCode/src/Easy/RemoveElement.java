package Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] numbers = {2,2,3,3};
        System.out.println(re.removeElement(numbers,3));
        for (int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
    }
}
