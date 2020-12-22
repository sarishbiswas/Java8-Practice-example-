package Easy.Array;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        for(int i=0,k=0;i<nums.length;i++){
            if(nums[k]==0){
                for(int j=k+1;j<nums.length;j++){
                    nums[j-1] = nums[j];
                }
                nums[nums.length-1]=0;
            }
            else{
                k++;
            }
        }
    }
    public void moveZeroesSubOptimal(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        for(int j=k;j<nums.length;j++)
            nums[j]=0;
    }
}
