package com.dhruv.recursion.assignments.easy;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(18));
    }
    static boolean isPowerOfTwo(int n){
//        base case
        if( n==1 ){
            return true ;
        }
        if( n%2 != 0 ){
            return false ;
        }
//        body
        return isPowerOfTwo(n/2);
    }
}
