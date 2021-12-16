package com.dhruv.recursion;

public class Fibonacci {
    public static void main(String[] args) {
       int ans = fibo(7);
        System.out.println(ans);
    }
    static int fibo( int fiboPosition ){
        // base condition
        if( fiboPosition<=1 ){
            return fiboPosition ;
        }
        // body and calls
        return fibo(fiboPosition-1)+fibo(fiboPosition-2);
    }
}
