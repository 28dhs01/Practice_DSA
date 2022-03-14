package com.dhruv.recursion.basics;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 505 ;
        int ans=sumOfDigits(n);
        System.out.println(ans);

    }
    static int sumOfDigits(int num){
        if( num < 10 ){
            return num ;
        }
        // body and calls
        return num%10 + sumOfDigits(num/10);
    }
}
