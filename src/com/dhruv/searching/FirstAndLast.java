package com.dhruv.searching;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int [] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int idx1 = bs1(arr , target);
        int idx2 = bs2(arr, target);
        int[]ans = {idx1,idx2};
        System.out.println(Arrays.toString(ans));
    }
    private static int bs1(int[]arr,int target ){
        int s = 0 ;
        int e = arr.length-1;
        int ans = -1 ;
        while( s <= e ){
            int m = s+(e-s)/2 ;
            if( arr[ m ] == target ){
                ans = m ;
                e = m-1 ;
            }
            else if( arr[ m ] > target ){
                e = m-1 ;
            }
            else if( arr[ m ] < target ){
                s = m+1 ;
            }
        }
        return ans ;
    }
    private static int bs2( int[] arr, int target){
        int s = 0 ;
        int e = arr.length -1 ;
        int ans = -1;
        while( s <= e ){
            int m = s+(e-s)/2;
            if( arr[ m ] == target ){
                ans = m ;
                s = m+1 ;
            }
            else if( arr[ m ] > target ){
                e = m-1 ;
            }
            else if( arr[ m ] < target ){
                s = m+1 ;
            }
        }
        return ans ;
    }
}
