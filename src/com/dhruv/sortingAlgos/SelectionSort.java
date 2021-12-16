package com.dhruv.sortingAlgos;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {7,5,3,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        // select the max index
        // put it at its right position
        // repeat above steps for n-1 times
        for (int i = 0; i < n-1; i++) {
            int lastIndex = n-1-i ;
            int maxIndex = findMaxIndex(arr,0,lastIndex);
            swap(arr,maxIndex,lastIndex);
        }
    }

    private static int findMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start ;
        for (int i = 1; i <= end; i++) {
            if( arr[i]> arr[maxIndex] ){
                maxIndex = i ;
            }
        }
        return maxIndex ;
    }
    private static void swap( int []arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}
