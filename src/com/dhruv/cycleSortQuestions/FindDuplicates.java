package com.dhruv.cycleSortQuestions;

import java.util.ArrayList;

public class FindDuplicates {
    public static void main(String[] args) {

        // I don't think this case could be solved using cycle sort
        int[]arr = {13 ,9, 25, 1 ,1, 0, 22, 13 ,22 ,20, 3, 8, 11, 25, 10, 3 ,15, 11, 19, 20, 2 ,4, 25, 14, 23, 14};
        int n = 26 ;
        ArrayList<Integer> ans = duplicates(arr, n) ;
        System.out.println(ans);


    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int i = 0 ;
        while( i < arr.length ){
            int correctIdx = arr[i] ;
            if( arr[correctIdx] != arr[i] ){
                // swap
                swap(arr, i, correctIdx);
            }
            else{
                i++ ;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for ( int j = 0 ; j<arr.length ;j++ ){
            if( !list.contains(arr[j]) && arr[j] != j ){
                list.add(arr[j]);
            }
        }
        if( list.isEmpty()){
            list.add(-1);
        }
        return list ;
    }
    static void swap( int[]nums, int first, int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp ;
    }
}
