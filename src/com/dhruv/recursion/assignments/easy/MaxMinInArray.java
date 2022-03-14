package com.dhruv.recursion.assignments.easy;

import java.util.Arrays;

public class MaxMinInArray {
    public static void main(String[] args) {
        int [] arr = {7,8,5,4,-1,6};
        int max = arr[0];
        int min = arr[0];
        int[] ans = minMax(1,arr, max,min );
        System.out.println(Arrays.toString(ans));
    }
    static int[] minMax(int curIdx, int[]arr, int max, int min ){
//        base case
        if( curIdx == arr.length ){
            int [] ans = new int[2];
            ans[0] = max;
            ans[1] = min ;
            return ans ;
        }
//        body
        if( arr[curIdx] > max ){
            max = arr[curIdx];
        }
        if( arr[curIdx] < min ){
            min = arr[curIdx];
        }
        return minMax(curIdx+1,arr, max,min);
    }
}
