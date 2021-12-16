package com.dhruv.searching;

public class RotationCount {
    public static void main(String[] args) {

        int []arr = {7,8,1,2,3,4,5};
        int pivotIdx = findPivot(arr);
        int timesRotated= pivotIdx+1 ;
        System.out.println(timesRotated);

    }
    static int findPivot(int[]arr){
        int s = 0 ;
        int e = arr.length-1 ;
        while( s<=e ){
            int m = s+(e-s)/2;
            if( m<e && arr[m] > arr[m+1] ){
                return  m;
            }
            if( m>0 && arr[ m ] < arr[ m - 1 ]){
                return m-1 ;
            }
            if( arr[s] > arr[m] ){
                e = m-1 ;
            }
            else{
                s = m+1 ;
            }
        }
        return -1 ;
    }
}
