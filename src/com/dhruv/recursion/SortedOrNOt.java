package com.dhruv.recursion;


public class SortedOrNOt {
    public static void main(String[] args) {
        int [] arr = new int [5] ;
        arr = new int[] {2,4,5,6,8};
        boolean isSorted = sortedOrNot(arr, 0);
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
}
