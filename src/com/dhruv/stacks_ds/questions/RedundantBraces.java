package com.dhruv.stacks_ds.questions;

import java.util.Stack;
//https://www.interviewbit.com/problems/redundant-braces/
public class RedundantBraces {
    public static void main(String[] args) {
        String str = "((a+b))";
        boolean isRedundant = braces(str);
        System.out.println(isRedundant);
    }
    static boolean braces(String A){
        Stack<Character> stack = new Stack<>();
        for( int i = 0 ; i<A.length() ;i++ ) {
            char ch = A.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            } else if (ch == ')') {
//                check for the peek val
                boolean isRedundant = true ;
                while( stack.peek() != '(' ){
                    isRedundant = false ;
                    stack.pop();
                }
                if( isRedundant ){
                    return true ;
                }
//                this is to remove the first element of the stack
                stack.pop() ;
            }
        }
        return false ;
    }
}
