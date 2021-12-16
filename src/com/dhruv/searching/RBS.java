package com.dhruv.searching;

public class RBS {
    public static void main(String[] args) {
        int[]arr = {6,7,1,2,3,4,5};
        int target = 4 ;
        int pivotIdx = findPivot(arr);
        if( pivotIdx == -1 ){
            int ans = bs(arr, target,0 ,arr.length-1 );
            System.out.println(ans);
        }
        else{
            int ans = bs(arr, target,0,pivotIdx);
            if( ans == -1 ){
                ans = bs(arr, target,pivotIdx+1,arr.length-1);
            }
            System.out.println(ans);
        }
    }
    static int findPivot(int[]arr){
        int s = 0 ;
        int e = arr.length-1 ;
        while ( s <= e ){
            int m = s+(e-s)/2 ;
            if( m < arr.length-1 && arr[ m ] > arr[ m + 1 ]){
                return m ;
            }
            if( m > 0 && arr[ m ] < arr[ m-1 ] ){
                return m-1 ;
            }
            if( arr[ s ] > arr [ m ] ){
                e = m-1 ;
            }
            else {
                s = m+1 ;
            }
        }
        return -1 ;
    }
    static int bs( int []arr, int target, int s, int e ){
        while( s<=e ){
            int m = s+(e-s)/2 ;
            if( arr[ m ] == target ){
                return m ;
            }
            if( arr[ m ] < target ){
                s = m+1 ;
            }
            else{
                e = m-1 ;
            }
        }
        return -1 ;
    }
}
