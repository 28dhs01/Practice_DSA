package com.dhruv.arrays;
//https://leetcode.com/problems/jump-game/
public class JumpGame {
    public static void main(String[] args) {

        int []nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    static boolean canJump(int[]nums){
        int lastGoodIdx = nums.length-1 ;
        for( int i = nums.length-2 ; i>=0 ;i-- ){
            if( i+nums[i] >= lastGoodIdx ){
                lastGoodIdx = i ;
            }
        }
        return lastGoodIdx==0 ;
    }
    
}
