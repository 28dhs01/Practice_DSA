package com.dhruv.recursion.basics;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        int ans = factorial(n);
        System.out.println(ans);
    }

    private static int factorial(int n) {

        // check for negative num
        if(n<0){
            return -1 ;
        }

        // base case
        if( n<=1 ){
            return 1 ;
        }
        // body and calls
        return n*factorial(n-1);
    }
}
