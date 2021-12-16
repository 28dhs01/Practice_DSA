package com.dhruv.recursion;

public class OneToN {
    public static void main(String[] args) {
        oneToN(10);
    }
    static void oneToN(int n){
        if( n == 1 ){
            System.out.print(n+ " ");
            return;
        }
        // body and calls
        oneToN(n-1);
        System.out.print(n+" ");
    }
}
