package com.dhruv.stacks_ds.questions;

import java.util.Stack;

public class ReverseStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(1);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }
    static void reverseStack(Stack<Integer> stack){
//        base case
        if( stack.isEmpty() ){
            return;
        }
//        body
        int peekElement = stack.peek();
        stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,peekElement);
    }
    static void insertAtBottom( Stack<Integer> stack , int element ){
//        base case
        if( stack.isEmpty() ){
            stack.push(element);
            return;
        }
//        body
        int peekElement = stack.peek();
        stack.pop();
        insertAtBottom(stack,element);
        stack.push(peekElement);
    }
}
