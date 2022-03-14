package com.dhruv.stacks_ds.questions;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

        String s = "{(";
        boolean isValid = isValid(s);
        System.out.println(isValid);
    }
    static boolean isValid (String s){
        Stack<Character> stack = new Stack<>();
        for( int i = 0 ; i<s.length() ; i++ ){
            char ch = s.charAt(i);
            if( ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                if( stack.isEmpty() ){
                    return false ;
                }
                if( ( ch == ')' && stack.peek() == '(' )
                        || ( ch == ']' && stack.peek() == '[' )
                        || ( ch == '}' && stack.peek() == '{' )
                ){
                    stack.pop();
                }else{
                    return false ;
                }
            }
        }
        if( stack.isEmpty() ){
            return true ;
        }else {
            return false ;
        }
    }
}
