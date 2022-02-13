package com.dhruv.searching;

public class AlmostSortedArray {
    public static void main(String[] args) {
        int[] arr = {10,3,40,20,50,80,70} ;
        int target = 10 ;
        int ans = nearlySorted(arr,target) ;
        System.out.println(ans);
    }
    static int nearlySorted(int[]arr, int target) {
        int s = 0  ;
        int e = arr.length-1 ;
        while( s<=e ){
            int m = s+(e-s)/2 ;
            if( arr[m] == target ){
                return m ;
            } else if (m>s && arr[m - 1] == target) {
                return m-1 ;
            }else if( m<e && arr[m+1] == target ){
                return m+1 ;
            }else if( target > arr[m] ){
                s = m+2 ;
            }else{
                e = m-2 ;
            }
        }
        return -1 ;
    }
}
