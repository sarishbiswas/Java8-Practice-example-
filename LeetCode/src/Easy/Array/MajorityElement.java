package Easy.Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1 );
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int max = 0;
        int val = 0;
        for(Integer key: map.keySet()){
            if(map.get(key)>max){
                max = map.get(key);
                val = key;
            }
        }
        return val;
    }
}