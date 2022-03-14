package com.dhruv.recursion.basics;

public class CountZeros {
    public static void main(String[] args) {
        int n = 302040 ;
//        int ans = count( n );
        int ans = count2(n);
        System.out.println(ans);
    }

    // my way
    private static int count(int n) {
        // base case
        if( n== 0 ){
            return 0 ;
        }
        // body and calls
        int lastDigit = n%10 ;
        if( lastDigit == 0 ){
            return 1+count(n/10);
        }
        else {
            return count(n/10);
        }
    }
    // efficient way
    static int efficientCount(int num,int count){
        // base case
        if( num == 0){
            return count ;
        }
        //  body and calls
        int lastDigit = num%10 ;
        if( lastDigit == 0 ){
            return efficientCount(num/10,count+1);
        }
        else {
            return efficientCount(num/10,count);
        }
    }
    static int count2(int n){
//        base case
        if( n== 0){
            return 0 ;
        }
//        body
        int lastDigit = n%10 ;
        if( lastDigit == 0 ){
            return 1+count2(n/10);
        }else{
            return count2(n/10);
        }
    }

    public static class SortedOrNot {

    }
}
