package com.dhruv.recursion.assignments.easy;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={3,2,7,1,5};
        bubbleSortViaRec(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSortViaRec(int[]arr, int lastIdx ){
//        base case
        if( lastIdx == 0 ){
            return;
        }
//        body
        boolean isSwapped = false ;
        for( int i =  1 ;i <= lastIdx ; i++ ){
            if( arr[i] < arr[i-1] ){
//                swap
                isSwapped = true ;
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        if( !isSwapped ){
            return;
        }
        bubbleSortViaRec(arr,lastIdx-1);
    }
}
