package com.dhruv.recursion.assignments.easy;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 15 ;
        if ( num==2 ){
            System.out.println("prime");
        }
        boolean isPrime = primeOrNot(num,num-1);
        System.out.println(isPrime);
    }
    static boolean primeOrNot( int num, int count ){
//        base case
        if( count == 1 ){
            return true ;
        }
        if( num % count == 0 ){
            return false ;
        }
//        body
        return primeOrNot(num , count-1);

    }
}
