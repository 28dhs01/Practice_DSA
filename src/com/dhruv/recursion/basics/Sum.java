package com.dhruv.recursion.basics;

public class Sum {
    public static void main(String[] args) {
        int n = 7 ;
        System.out.println(sum(n));
    }
    static int sum(int n){
        // base condition
        if(n==1){
            return 1 ;
        }
        // body and calls
        return n+sum(n-1);
    }
}
