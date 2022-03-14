package com.dhruv.recursion.basics;

public class nTo1Then1Ton {
    public static void main(String[] args) {
        print(10);
    }
    static void print(int n){
        if( n == 0 ){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}
