package com.dhruv.stringsAndStringBuilders.assingment.easy;

import java.util.Locale;

//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abca";
        boolean ans = validPalindrome(s);
        System.out.println(ans);

    }
     static boolean validPalindrome(String s) {

        int start = 0 ;
        int end = s.length()-1 ;
        while( start<=end ){
            if( s.charAt(start) == s.charAt(end) ){
                start++;
                end-- ;
            }else{
                return isPalindrome(s,start,end-1) || isPalindrome(s,start+1,end);
            }
        }
        return true;

    }
    static boolean isPalindrome(String s , int start, int end ){
        while( start<=end ){
            if( s.charAt(start) == s.charAt(end) ){
                start++ ;
                end-- ;
            }else{
                return false ;
            }
        }
        return true;
    }
}
