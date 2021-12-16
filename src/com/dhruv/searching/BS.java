package com.dhruv.searching;

public class BS {
    public static void main(String[] args) {
//        int [] arr = {2,6,8,10,12,14};
//        int target = 10 ;

        int[] arr = {14,12,10,8,6,2} ;
        int target = 4 ;
        if( arr[0] < arr[arr.length-1]){
            System.out.println("ascending");
        }
        else{
            System.out.println("descending");
        }
//        int findIdx = decBS(arr,target);
//        System.out.println(findIdx);
    }
    static int bs( int[] arr, int target ){
        int s = 0 ;
        int e = arr.length-1 ;
        while( s<=e ){
            int m = s+(e-s)/2 ;
            if( arr[ m ] == target ){
                return m ;
            }
            if( arr[ m ] < target ){
                s = m + 1;
            }
            else if( arr[ m ] > target ){
                e = m - 1 ;
            }
        }

        return -1 ;
    }
    static int decBS( int []arr, int target ){
        int s = 0 ;
        int e = arr.length - 1 ;
        while( s<=e ){
            int m = s+(e-s)/2 ;
            if( arr[ m ] == target ){
                return m ;
            }
            if( arr[ m ] > target ){
                s = m+1 ;
            }
            else{
                e = m - 1;
            }
        }
        return -1 ;
    }
}
