package com.dhruv.recursion.assignments.easy;

public class ProductOf2Num {
    public static void main(String[] args) {
        int a = 5 ;
        int b = 6 ;
        int ans = 0 ;
        if( a<b ){
            ans = product(b,a);
        }else {
            ans = product(a,b);
        }
        System.out.println(ans);
    }
    static int product( int a , int b ){
//        base case
        if ( b == 1 ){
            return a ;
        }
//        body
        return a+product(a,b-1);

    }
}
