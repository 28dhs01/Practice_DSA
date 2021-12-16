package com.dhruv.recursion;

public class PalindromeOrNot {
    public static void main(String[] args) {
        // iteration method
        int num = 7 ;
        int reverseNum = reverseUsingIteration(num);
        if( num == reverseNum ){
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("NOT-PALINDROME");
        }
    }
    static int reverseUsingIteration(int num){
        int ans = 0 ;
        while( num != 0 ){
            int rem = num%10 ;
            ans = ans*10 + rem ;
            num = num/10 ;
        }
        return ans ;
    }
}
