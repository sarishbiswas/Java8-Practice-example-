package Test;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,9,3};
        int max=arr[0];
        int secondMax = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>secondMax){
                if(arr[i]<max)
                    secondMax = arr[i];
                else {
                    secondMax = max;
                    max = arr[i];
                }
            }
        }
        System.out.println("The second largest is: "+secondMax);
    }
}
