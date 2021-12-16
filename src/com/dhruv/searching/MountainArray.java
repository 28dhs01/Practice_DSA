package com.dhruv.searching;

public class MountainArray {
    public static void main(String[] args) {
        int []arr = {2,4,6,7,8,10,1};
        int peakIdx = peak(arr);
        System.out.println(peakIdx);
    }
    static int peak(int []arr){
        int s = 0 ;
        int e = arr.length-1 ;
        while( s<e ){
            int m = s+(e-s)/2 ;
            if( arr[ m ] > arr[ m+1 ] ){
                e = m ;
            }
            else{
                s = m+1 ;
            }
        }
        return s ;
    }
}
