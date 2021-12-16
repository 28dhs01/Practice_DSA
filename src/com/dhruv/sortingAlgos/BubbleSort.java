package com.dhruv.sortingAlgos;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {2,1,6,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr) {
        int n = arr.length ;
        boolean isSwapped ;
        for (int i = 0; i < n-1 ; i++) {
            isSwapped = false ;
            for (int j = 1; j <= n - 1 - i; j++) {
                if(arr[j] < arr[j-1]){
                    // swap
                    swap(arr,j,j-1);
                    isSwapped = true ;
                }
            }
            if( !isSwapped ){
                break;
            }
        }
    }
    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
