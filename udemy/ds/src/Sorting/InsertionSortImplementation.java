package Sorting;

import java.util.Arrays;

public class InsertionSortImplementation {
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j,temp = arr[i];
            for(j=i;j>0 && arr[j-1]>temp;j--){
                arr[j]=arr[j-1];
            }
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,-13,8,45,71,9,-1};
        insertionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
