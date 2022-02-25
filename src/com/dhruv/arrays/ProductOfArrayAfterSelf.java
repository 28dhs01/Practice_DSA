package com.dhruv.arrays;

import java.util.Arrays;
//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayAfterSelf {
    public static void main(String[] args) {
        int[]nums = {1,2,3,4};
        int []ans = solution(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int [] solution(int[]nums){
        int []ans= new int[nums.length];
        int []left = new int[nums.length];
        int []right = new int[nums.length];
        left[0] = 1 ;
        for( int i = 1 ;i< nums.length; i++ ){
            left[i] = left[i-1]*nums[i-1];
        }
        right[nums.length-1] = 1 ;
        for (int i = nums.length-2 ;i>=0 ;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}
