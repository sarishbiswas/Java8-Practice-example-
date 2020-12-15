package Easy.Array;

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int curr = nums[0];
        int global = curr;
        for(int i=1;i<nums.length;i++){
            if(nums[i]+curr>nums[i])
                curr = nums[i]+curr;
            else
                curr = nums[i];
            if(curr>global)
                global = curr;
        }
        return global;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
