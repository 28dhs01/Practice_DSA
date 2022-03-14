package com.dhruv.stacks_ds.questions;

import java.util.Stack;
//https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1/
public class DeleteMidOfStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        deleteMid(s,5);
        System.out.println(s);
    }
    static void deleteMid(Stack<Integer> s, int sizeOfStack){
//        base case
        if( s.size() == (sizeOfStack+1)/2 ){
            s.pop();
            return;
        }
//        body
        int peekElement = s.peek() ;
        s.pop();
        deleteMid(s,sizeOfStack);
        s.push(peekElement);
    }
}
