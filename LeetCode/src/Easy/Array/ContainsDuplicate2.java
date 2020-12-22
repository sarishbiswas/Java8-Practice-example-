package Easy.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
                return true;
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(arr,2));
    }
}
