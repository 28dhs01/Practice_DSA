package com.dhruv.sortingAlgos;

public class CycleSort {
    public static void main(String[] args) {

    }
    void cycleSort( int []arr){
        int i = 0 ;
        while( i < arr.length ){
            int correctIdx = arr[i] - 1 ;
            if( correctIdx != i ){
                // make swap
                swap(arr, i, correctIdx);
            }
            else{
                i++ ;
            }
        }
    }
    static void swap(int []arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
