package com.dhruv.searching;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int [] arr = {2,4,7,8,9,10,15,29,32,45,48,49,52,57,75,79,89,90,91,97,110,122,128,129,159,170,179,182,189,190};
        int target = 91 ;
        int ans = range(arr,target);
        System.out.println(ans);
    }
    static int range(int[] arr, int target){
        int s = 0 ;
        int e = 1 ;
        while( target > arr[ e ] ){
            int temp = e+1 ;
            e = e+(e-s+1)*2 ;
            s = temp ;
        }
        return bs(arr,target,s,e);
    }
    static int bs(int[]arr, int target, int s, int e){
        while( s<=e ){
            int m = s+(e-s)/2;
            if( arr[m] == target ){
                return m ;
            }
            if( arr[ m ]< target ){
                s = m+1 ;
            }
            else{
                e = m-1 ;
            }
        }
        return -1 ;
    }
}
