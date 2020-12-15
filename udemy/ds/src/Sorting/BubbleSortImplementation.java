package Sorting;

import java.util.Arrays;

public class BubbleSortImplementation {
    public static int[] bubbleSort(int[] arr){
        for(int i=arr.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,-13,8,45,71,9,-1};
        int arr1[] = bubbleSort(arr);
        Arrays.stream(arr1).forEach(System.out::println);
    }
}
