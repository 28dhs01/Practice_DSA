package com.dhruv.recursion;

public class ReverseNumber {
//    static int ans = 0;
    public static void main(String[] args) {
        int n = 1_53_42_36_469 ;
//        reverseNumber(n);
//        System.out.println(ans);

        // using iteration
//
//        int ans2 = 0 ;
//        while ( n != 0 ){
//            int rem = n%10 ;
//            ans2 = ans2*10 + rem ;
//            n = n/10 ;
//        }
//        System.out.println(ans2);

        // using no. of digits
//        int finalAns = reverseNumber2(n);
//        System.out.println(finalAns);

//        looking what I do in iteration and then apply same concept here
        if( n<0 ){
            n = -n;
            int revNum = reverseNumber3(n,0);
            revNum = -revNum ;
            System.out.println(revNum);
        }else{
            int revNum = reverseNumber3(n,0);
            System.out.println(revNum);
        }
    }

//    private static void reverseNumber(int n) {
//        // base condition
//        if( n == 0 ){
//            return;
//        }
//        // body and calls
//        int rem = n%10 ;
//        ans = 10*ans + rem ;
//        reverseNumber(n/10);
//    }
    private static int reverseNumber2(int n){
        if( n == 0 ){
            return 0 ;
        }
        // this check is only for -ve numbers
        if( n < 0 ){
            n = - n;
            int digits = (int) ((Math.log(n)/Math.log(10)) + 1);

            int myAns = helper(n,digits);
            return -myAns ;
        }
        int digits = (int) ((Math.log(n)/Math.log(10)) + 1);
        int myAns = helper(n,digits);
        return myAns ;
    }

    private static int helper(int n, int digits) {
        // base condition
        if( n == 0 ){
            return 0 ;
        }
        // body and calls
        int rem = n%10 ;
        return (int) (rem*Math.pow(10,digits-1) + helper(n/10,digits-1));
    }
    static int reverseNumber3 (int n , long revNum ){
//        base case
        if( n==0 ){
            return (int)revNum ;
        }
//        body
        int lastDigit = n%10 ;
        revNum = revNum*10 ;
        if( revNum>Integer.MAX_VALUE){
            return 0 ;
        }
        revNum = revNum+lastDigit ;
        return reverseNumber3(n/10,revNum);
    }
}
