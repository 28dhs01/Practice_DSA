package com.dhruv.stringsAndStringBuilders.assingment.easy;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "";
        s = s.toLowerCase();
        boolean ans = isPalindrome(s) ;
        System.out.println(ans);
    }
    private static boolean isPalindrome(String str ){
        if(str.isEmpty()){
            return true ;
        }
        for (int i = 0; i <= str.length()/2 ; i++) {
            char start = str.charAt(i) ;
            char end = str.charAt(str.length()-1-i);

            if( start != end ){
                return false;
            }
        }
        return true ;
    }
}
