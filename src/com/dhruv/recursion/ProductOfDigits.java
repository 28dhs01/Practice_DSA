package com.dhruv.recursion;


public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1671 ;
        int ans = productOfDigits(n);
        System.out.println(ans);
    }

    private static int productOfDigits(int n) {
        // base condition
        if( n < 10 ){
            return n ;
        }
        // body and calls
        return n%10*productOfDigits(n/10);
    }

}
