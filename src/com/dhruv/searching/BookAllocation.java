package com.dhruv.searching;

public class BookAllocation {
    public static void main(String[] args) {
        int [] ar = {12,34,67,90};
        int N = ar.length ;
        int M = 2 ;
        int res = findPages(ar,N,M) ;
        System.out.println(res);
    }
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int s = 0 ;
        int e = 0 ;
        for( int num : A ){
            s = Math.max(num,s);
            e += num ;
        }
        int res = 0 ;
        while( s<=e ){
            int m = s+(e-s)/2 ;
            int sum = 0 ;
            int student = 1 ;
            for( int num : A ){
                if( sum+num > m ){
                    student++ ;
                    sum = num ;
                }else{
                    sum += num ;
                }
            }
            if( student > M ){
                s = m+1 ;
            }else{
                res = m ;
                e = m -1 ;
            }
        }
        return res ;
    }
}
