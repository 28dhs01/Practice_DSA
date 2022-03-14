package com.dhruv.stacks_ds.custom_stack;

public class CustomStack {
    private int size = 5 ;
    private int[] data = new int[size]  ;
    int ptr1 = -1 ;

//    push method
    void push(int val){
       if( ptr1 >=4 ){
           System.out.println("stack is full");
       }else{
           ptr1++ ;
           data[ptr1] = val ;
       }
    }
//    pop method
    void pop( ){
        if( ptr1 == -1 ){
            System.out.println("stack is empty");
        }else{
            ptr1-- ;
        }
    }
//    peek method
    int peek(){
        if( ptr1 == -1 ){
            System.out.println("stack is empty");
            return -1;
        }else{
            return data[ptr1];
        }
    }
//    isEmpty method
    boolean isEmpty(){
        return ptr1 == -1 ;
    }
//    size method
    int size(){
        return size ;
    }
}
