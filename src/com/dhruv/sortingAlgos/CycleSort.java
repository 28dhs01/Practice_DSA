package com.dhruv.sortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CycleSort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int [] arr = {3,5,2,1,4} ;
//        cycleSort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort( int []arr){
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
