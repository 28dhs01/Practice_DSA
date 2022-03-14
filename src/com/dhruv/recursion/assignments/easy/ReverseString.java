package com.dhruv.recursion.assignments.easy;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String ans = rev(str.toCharArray(),0,str.length()-1);
        System.out.println(ans);

    }
    static String rev(char[] str, int s, int e){
//        base case
        if( s>e ){
            return Arrays.toString(str);
        }
//        body
        char temp = str[s];
        str[s] = str[e];
        str[e] = temp ;
        return rev(str,s+1,e-1);
    }
}
