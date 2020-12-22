package Easy.Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x:nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
