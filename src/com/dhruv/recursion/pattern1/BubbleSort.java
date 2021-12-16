package com.dhruv.recursion.pattern1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,5};
        bubbleSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int r, int c) {
        // base case
        if( r == 0 ){
            return;
        }
        // body and calls
        if( c < r ){
            if( arr[c] > arr[c+1] ){
                //swap
                int temp = arr[c] ;
                arr[c] = arr[c+1] ;
                arr[c+1] = temp ;
            }
            bubbleSort(arr, r,c+1);
        }
        else{
            bubbleSort(arr,r-1,0);
        }
    }
}
