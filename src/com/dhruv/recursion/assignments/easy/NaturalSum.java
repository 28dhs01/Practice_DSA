package com.dhruv.recursion.assignments.easy;

public class NaturalSum {
    public static void main(String[] args) {
        int n = 10 ;
        System.out.println(naturalSum(10));
    }
    static int naturalSum( int n ){
//        base case
        if( n == 1 ){
            return 1 ;
        }
//        body
        return n+naturalSum(n-1);
    }
}
