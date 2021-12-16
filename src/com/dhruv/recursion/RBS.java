package com.dhruv.recursion;

public class RBS {
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9,1,2,3};
        int target = 1 ;
        int targetIdx = rbs(arr, target,0,arr.length-1);
        System.out.println(targetIdx);
    }
    static int rbs( int []arr, int target, int s, int e ){
        // base case
        if( s>e ){
            return -1 ;
        }
        // body and calls
        int m = s+(e-s)/2 ;
        if( arr[ m ] == target ){
            return m ;
        }
        if( arr[s] <= arr[ m ]){
            // it means the arr is sorted
            if( target >= arr[s] && target<arr[m]){
                return rbs(arr, target,s,m-1);
            }
            else {
                return rbs(arr, target,m+1,e);
            }
        }
        if( target > arr[ m ] && target <= arr[ e ] ){
            return rbs(arr, target,m+1,e);
        }
        else {
            return rbs(arr, target,s,m-1);
        }
    }
}
