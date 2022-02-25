package com.dhruv.recursion;


public class sortedOrNot {
    public static void main(String[] args) {
        int [] arr = new int [5] ;
        arr = new int[] {2,4,1,6,8};
//        boolean isSorted = sortedOrNot(arr, 0);
//        System.out.println(isSorted);
        boolean isSorted = sortedOrNot2(arr,1);
        System.out.println(isSorted);
    }
    static boolean sortedOrNot(int[]arr, int curIdx){
        // base condition
        int size = arr.length ;
        if( curIdx == size-1 ){
            return true ;
        }
        // body and calls
        return (arr[curIdx] < arr[curIdx+1] ) && sortedOrNot(arr, curIdx+1);
    }
    static boolean sortedOrNot2( int []arr, int curIdx ){
//        base case
        if( curIdx == arr.length){
            return true;
        }
//        body
        if( arr[curIdx]>= arr[curIdx-1] ){
            return sortedOrNot2(arr, curIdx+1);
        }else{
            return false;
        }
    }
}
