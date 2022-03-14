package com.dhruv.recursion.assignments.easy;

public class FirstUppercaseInString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String ans = firstUppercase(str);
        System.out.println(ans);
    }
    static String firstUppercase(String str){
//        base case
        if( str.isEmpty() ){
            return "-1";
        }
        char f = str.charAt(0);
        if( f >= 'A' && f<= 'Z' ){
            return f+"";
        }
//        body
        return firstUppercase(str.substring(1));
    }
}
