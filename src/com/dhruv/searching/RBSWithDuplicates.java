package com.dhruv.searching;

public class RBSWithDuplicates {
    public static void main(String[] args) {
        int []arr= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1} ;
        int pivotIdx = rbsWithDuplicates(arr);
        System.out.println(pivotIdx);
    }
    private static int rbsWithDuplicates(int[]arr){

        int s = 0 ;
        int e= arr.length-1 ;
        while ( s<=e ){
            int m = s+(e-s)/2 ;
            // the below 2 checks are same that of normal rbs
            if( m<e && arr[m] > arr[m+1] ){
                return m ;
            }
            if( m>s && arr[ m ] < arr[ m-1 ] ){
                return m-1 ;
            }

            // check if elements of s, m and e all are equal
            if( arr[s] == arr[m] && arr[m] == arr[e] ){

                if( s < e && arr[s]>arr[s+1]){
                    return s ;
                }
                s++ ;
                if( e > s &&  arr[e] < arr[e-1] ){
                    return e-1 ;
                }
                e-- ;
            }

            // check for left side to be sorted
            else if( arr[s] < arr[ m ] || (arr[s] == arr[m] && arr[m]>arr[e]) ){
                s = m+1 ;
            }

            // otherwise
            else{
                e = m-1 ;
            }


        }
        return -1 ;
    }

}
