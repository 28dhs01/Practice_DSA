package com.dhruv.recursion.assignments.easy;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = {3,5,2,6,1};
//        System.out.println(Arrays.toString(arr));
        is(arr,1);
        System.out.println(Arrays.toString(arr));
    }
    static void is(int[]arr, int curIdx){
//        base case
        if( curIdx == arr.length ){
            return;
        }
//        body
        for (int i = curIdx ; i > 0  ; i--) {
            if( arr[i] < arr[i-1] ){
//                swap
                swap(arr,i-1,i);
            }
            else {
                break;
            }
        }
        is(arr,curIdx+1);
    }
    static void swap(int []arr, int firstIdx, int secondIdx){
        int temp = arr[firstIdx];
        arr[firstIdx] = arr[secondIdx];
        arr[secondIdx] = temp ;
    }
}
