package com.dhruv.recursion;

public class Fibonacci {
    public static void main(String[] args) {

       int ans = fibo(4);
        System.out.println(ans);
    }
//    this solution won't work for bigger values of n as tc is 2^n. For that check fib formula
    static int fibo( int fiboPosition ){
        // base condition
        if( fiboPosition<=1 ){
            return fiboPosition ;
        }
        // body and calls
        return fibo(fiboPosition-1)+fibo(fiboPosition-2);
    }
}
