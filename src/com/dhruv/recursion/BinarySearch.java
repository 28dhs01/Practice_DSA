package com.dhruv.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,6,8,14,20};
        int target = 2 ;
        System.out.println(bs(arr,target,0,arr.length-1));
    }
    static int bs( int []arr, int target, int s ,int e){
        // base condition
        if( s>e ){
            return -1 ;
        }
        // body and calls
        int m = s+(e-s)/2 ;
        if( arr[ m ] == target){
            return m ;
        }
        if( arr[ m ] < target ){
            return bs(arr, target,m+1,e);
        }
        else {
            return bs(arr, target,s,m-1);
        }
    }
}
