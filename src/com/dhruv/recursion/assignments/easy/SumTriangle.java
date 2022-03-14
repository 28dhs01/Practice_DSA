package com.dhruv.recursion.assignments.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int [] ar = {4,7,3,6,7};
//        sumTriangle(ar,ar.length);

        long [] ans = sumTriangle(ar,ar.length);
        System.out.println(Arrays.toString(ans));
    }
//    static void sumTriangle(int[]nums, int n){
////        base case
//        if( n == 1 ){
//            System.out.print(nums[0] +" ");
//            return;
//        }
////        body
//        int []temp = new int[n-1];
//        for( int i = 0 ; i< temp.length ; i++ ){
//            temp[i] = nums[i]+nums[i+1];
//        }
//        sumTriangle(temp, temp.length);
//        for(int i = 0 ; i< nums.length;i++ ){
//            System.out.print(nums[i] +" ");
//        }
//
//    }
    static long[] sumTriangle(int[]nums, int n){

        ArrayList<Integer> list = new ArrayList<>();
//        for( int i = 0 ; i<nums.length ;i ++){
//            list.add(nums[i]);
//        }
        ArrayList<Integer> ansList = helper(nums,n,list);
        int size = ( n*(n+1) ) /2 ;
        long[] ans = new long[size] ;
        for( int i = 0 ; i< ans.length ;i++ ){
            ans[i] = ansList.get(i);
        }
        return ans ;
    }
    static ArrayList<Integer> helper(int[]nums,int n, ArrayList<Integer> list){
        //        base case
        if( n == 1 ){
            list.add(nums[0]);
            return list;
        }
//        body
        int []temp = new int[n-1];
        for( int i = 0 ; i< temp.length ; i++ ){
            temp[i] = nums[i]+nums[i+1];
        }
        helper(temp, temp.length,list);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return list ;
    }
}
