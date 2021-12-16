package com.dhruv.searching;

public class Floor {
    public static void main(String[] args) {

        int []arr= {2,6,8,10,12,16};
        int target = 11 ;
        System.out.println(floor(arr, target));

    }
    static int floor( int[] arr, int target ){
        if( target < arr[ 0 ]){
            return -1;
        }
        int s= 0 ;
        int e = arr.length - 1 ;
        while( s <= e ){
            int m = s+(e-s)/2 ;
            if( arr[ m ] == target ) {
                return m ;
            }
            if( arr[ m ] > target ){
                e = m-1 ;
            }
            else{
                s = m+1 ;
            }
        }
        return e ;
    }
}
