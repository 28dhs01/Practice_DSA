package com.dhruv.stacks_ds.questions;

import java.util.Stack;
//https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
public class ReverseString {
    public static void main(String[] args) {

        String name = "dhruv";
        String ans = reverse(name);
        System.out.println(ans);
    }
    static String reverse(String S){
        Stack<Character> stack = new Stack<>() ;
        for( int i = 0 ; i<S.length() ;i++ ){
            char ch = S.charAt(i);
            stack.push(ch);
        }
        StringBuilder ansString = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char peek = stack.peek();
            ansString.append(peek);
            stack.pop();
        }
        return ansString.toString();
    }
}
