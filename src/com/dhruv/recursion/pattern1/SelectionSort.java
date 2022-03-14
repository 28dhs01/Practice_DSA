package com.dhruv.recursion.pattern1;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,5};
//        selectionSort(arr, arr.length,0,0);
//        System.out.println(Arrays.toString(arr));

        selectionSort2(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int r, int c, int maxIdx) {
        // base case
        if( r == 0 ){
            return;
        }
        // body and calls
        if( c < r ){
            if( arr[c] > arr[maxIdx] ){
                selectionSort(arr, r, c+1,c);
            }else{
                selectionSort(arr, r, c+1,maxIdx);
            }
        }
        else{
            // here one row has been traversed
            // hence maxIdx would have been found
            // hence swap maxIdx with r-1
            int temp = arr[r-1] ;
            arr[r-1] = arr[maxIdx] ;
            arr[maxIdx] = temp ;

            selectionSort(arr, r-1,0,0);
        }
    }
    static void selectionSort2(int []arr, int curIdx, int lastIdx, int maxIdx ){
//        base case
        if( lastIdx == 0 ){
            return;
        }
//        body
        if( curIdx <= lastIdx ){
            if( arr[curIdx]>arr[maxIdx] ){
                selectionSort2(arr, curIdx+1,lastIdx,curIdx);
            }else{
                selectionSort2(arr, curIdx+1,lastIdx,maxIdx);
            }
        }else{
//            swap
            int temp = arr[lastIdx];
            arr[lastIdx] = arr[maxIdx];
            arr[maxIdx] = temp ;
            selectionSort2(arr, 0,lastIdx-1,0);
        }
    }

}
