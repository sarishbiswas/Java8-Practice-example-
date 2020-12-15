package Sorting;

import java.util.Arrays;

public class SelectionSortImplementation {
    public static void selectionSort(int [] arr){
        for (int i=arr.length-1;i>=0;i--){
            int max = i;
            for (int j=0;j<i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,-13,8,45,71,9,-1};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
