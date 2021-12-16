package com.dhruv.searching;

public class Ceiling {
    public static void main(String[] args) {
        int []arr = {2,6,8,10,12,16};
        int target = 11 ;
        int ceil = ceiling(arr, target);
        System.out.println(ceil);


    }
    static int ceiling(int []arr, int target){
        if( target >= arr[arr.length-1] ){
            return -1 ;
        }
        int s = 0 ;
        int e = arr.length-1 ;
        while( s <= e ){
            int m = s+(e-s)/2 ;
            if( arr[ m ] == target ){
                return arr[ m ] ;
            }
            if( arr [ m ] < target ){
                s = m + 1 ;
            }
            else{
                e = m - 1 ;
            }
        }
        return arr[s];
    }
}
