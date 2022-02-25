package com.dhruv.recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
//        int []arr = {8,15,12,17,2,3};
//        int target = 3 ;
////        boolean isPresent= isPresent( arr,target,0 );
////        System.out.println(isPresent);
//        boolean isPresent = checkFromLast(arr, target, arr.length-1);
//        System.out.println(isPresent);

        int []arr = {2,3,1,3,4} ;
        int target = 3 ;
        ArrayList<Integer> list  = new ArrayList<>() ;
//        ArrayList<Integer> ansList = linearSearchWithDuplicates(arr, target ,0,list);
        ArrayList<Integer> ansList = linearSearchWithDuplicates(arr, target, 0);
        System.out.println(ansList);

    }
    static boolean isPresent(int[]arr, int target,int curIdx) {
        int size = arr.length;
        if (curIdx == size) {
            return false;
        }
//        // body and calls
//        return (arr[curIdx] == target) || isPresent(arr, target,curIdx+1);

        if (arr[curIdx] == target) {
            return true;
        }
        return isPresent(arr, target, curIdx + 1);
    }
    static boolean checkFromLast(int[]arr, int target, int index){
        if( index == -1 ){
            return false ;
        }
        return (arr[index] == target) || checkFromLast(arr, target,index-1);
    }
    static ArrayList<Integer> linearSearchWithDuplicates(int[] arr, int target, int curIdx, ArrayList<Integer>list){
        // base case
        if( curIdx == arr.length ){
            return list ;
        }
        // body and calls
        if( arr[curIdx] == target ){
            list.add(curIdx);
        }
        return linearSearchWithDuplicates(arr, target,curIdx+1,list);

    }
    static ArrayList<Integer> linearSearchWithDuplicates(int[]arr, int target, int curIdx){
        ArrayList<Integer> list = new ArrayList<>();
        if( curIdx == arr.length){
            return list ;
        }
        if( arr[curIdx] == target ){
            list.add(curIdx);
        }
        ArrayList<Integer> listFromBelowCalls = linearSearchWithDuplicates(arr, target,curIdx+1);
        list.addAll(listFromBelowCalls);
        return list ;

    }

}
