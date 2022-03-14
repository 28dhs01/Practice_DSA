package com.dhruv.arrays.medium;
//https://leetcode.com/problems/rotate-array/submissions/
public class RotateArray {
    public void rotate(int[] nums, int k) {
//         the below solution is absolutely right but i don't understand why it is giving TLE error
        // int actualRotations = k%nums.length ;
        // for( int j = 1 ; j<=actualRotations ;j++ ){
        //     int lastElement = nums[nums.length-1] ;
        //     for( int i = nums.length-1 ;i>0 ; i-- ){
        //         nums[i] = nums[i-1];
        //     }
        //     nums[0] = lastElement ;
        // }

//         this is some reverse algo technique
//         basically first I reverse first half part then remaining half part and in the end reverse whole array
        k=k%nums.length ;
        reverseArray(nums,0,nums.length-k-1) ;
        reverseArray(nums,nums.length-k,nums.length-1);
        reverseArray(nums,0,nums.length-1);

    }
    void reverseArray(int[]arr, int s, int e){
        while( s<=e ){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++ ;
            e-- ;
        }
    }
}
