package Easy.Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0)
            return list;
        int first = nums[0];
        int second = nums[0];
        for(int i=0;i< nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                second = nums[i+1];
            }else{
                second = nums[i];
                if(first!=second){
                    String str = first+"->"+second;
                    list.add(str);
                }else{
                    list.add(String.valueOf(first));
                }
                first = nums[i+1];
            }
        }
        if(first!=second && second>first){
            String str = first+"->"+second;
            list.add(str);
        }else{
            list.add(String.valueOf(first));
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={0,1,2,4,5,7,9,10};
        System.out.println(summaryRanges(arr));
    }
}
