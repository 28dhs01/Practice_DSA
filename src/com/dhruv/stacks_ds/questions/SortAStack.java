package com.dhruv.stacks_ds.questions;

import java.util.Stack;
//https://practice.geeksforgeeks.org/problems/sort-a-stack/1#
public class SortAStack {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>() ;
        stack.push(7);
        stack.push(9);
        stack.push(3);
        stack.push(8);
        System.out.println(stack);
        sort(stack);
        System.out.println(stack);
    }
    static void sort(Stack<Integer> stack){
//        base case
        if( stack.size() == 1 ){
            return;
        }
//        body
        int peekElement = stack.peek();
        stack.pop();
        sort(stack);
        placeAtCorrect(stack,peekElement);
    }
    static void placeAtCorrect(Stack<Integer> stack, int element){
//        base case
        if( stack.isEmpty() ){
            stack.push(element);
            return;
        }
//        body
        int peekElement = stack.peek() ;
        if( element > peekElement ){
            stack.push(element);
            return;
        }
        stack.pop() ;
        placeAtCorrect(stack,element);
        stack.push(peekElement);
    }
}
