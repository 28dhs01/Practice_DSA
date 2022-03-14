package com.dhruv.stacks_ds.questions;

import java.util.Stack;

public class CountReversals {
    public static void main(String[] args) {
        String S = "}{{}}{{{" ;
        int count = countRev(S);
        System.out.println(count);
    }
    static int countRev (String s){
        Stack<Character> stack = new Stack<>() ;
        if( s.length()%2 == 1 ){
            return -1 ;
        }
        for( int i = 0 ; i<s.length() ; i++ ){
            char ch = s.charAt(i);
            if( ch == '{' ){
                stack.push(ch);
            }else {
//                it would be closing brace
                if( !stack.isEmpty() && stack.peek() =='{' ){
                    stack.pop() ;
                }else{
                    stack.push(ch);
                }
            }
        }
        if( stack.isEmpty() ) {
            return 0;
        }
        int a = 0 ;
        int b = 0 ;
        while (! stack.isEmpty() ){
            char peekElement = stack.peek() ;
            if( peekElement == '{' ){
                a++ ;
                stack.pop();
            }else{
                b++ ;
                stack.pop();
            }
        }
        return ((a+1)/2) + ((b+1)/2) ;



    }
}
