package Easy.Array;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(;i<nums.length;){
            if(nums[i]>=target)
                break;
            else
                i++;
        }
        return i;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int[] arr = {1,3,5,7};
        System.out.println(sip.searchInsert(arr,1));
        System.out.println(sip.searchInsert(arr,9));
        System.out.println(sip.searchInsert(arr,0));
        System.out.println(sip.searchInsert(arr,6));
        System.out.println(sip.searchInsert(arr,2));
    }
}
