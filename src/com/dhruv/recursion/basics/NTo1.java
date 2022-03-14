package com.dhruv.recursion.basics;

public class NTo1 {
    public static void main(String[] args) {
        nto1(10);
    }
    static void nto1(int n){
        if( n == 1 ){
            System.out.println(n +" ");
            return;
        }
        // body and calls
        System.out.print(n +" ");
        nto1(n-1);
    }
}
