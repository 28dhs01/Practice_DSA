package com.dhruv.stacks_ds.questions;

import java.util.Stack;

public class InsertElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(8);
        stack.push(9);
        stack.push(5);
        stack.push(4);
        int element = 100 ;
//        System.out.println(stack);
        insertElementAtBottom(stack,element);
        System.out.println(stack);
    }
    static void insertElementAtBottom(Stack<Integer> stack , int elementToAdd ){
//        base case
        if ( stack.isEmpty() ){
            stack.push(elementToAdd);
            return;
        }
//        body
        int peekElement = stack.peek() ;
        stack.pop();
        insertElementAtBottom(stack,elementToAdd);
        stack.push(peekElement);

    }
}
