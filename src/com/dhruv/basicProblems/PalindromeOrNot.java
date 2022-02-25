package com.dhruv.basicProblems;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String res = is_palindrome(5555);
        System.out.println(res);
    }
    public static String is_palindrome(int n)
    {
        // Code here
        int originalNum = n ;
        int revNum = 0 ;
        while( n > 0 ){
            int lastDigit = n%10 ;
            revNum = revNum*10 + lastDigit ;
            n = n/10 ;
        }
        if( originalNum == revNum ){
            return "Yes" ;
        }else{
            return "No" ;
        }
    }
}
