package com.dhruv.recursion.basics;

public class CountSteps {
    public static void main(String[] args) {
        int n = 20 ;
        int ans = countSteps(n,0);
        System.out.println(ans);
    }
    static int countSteps(int n , int steps){
        // base condition
        if( n == 0 ){
            return steps ;
        }
        // body and calls
        if( (n&1) == 1){
            return countSteps(n-1,steps+1);
        }
        else {
            return countSteps(n/2,steps+1);
        }
    }
}
