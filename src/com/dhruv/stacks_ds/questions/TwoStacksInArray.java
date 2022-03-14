package com.dhruv.stacks_ds.questions;

public class TwoStacksInArray {
    int size = 5 ;
    int[] arr = new int[size];
    int top1 = -1 ;
    int top2 = size ;
//    push for stack 1
    void push1( int val ){
        if( top2 - top1 <=1 ){
            System.out.println("stack1 is full ");
        }else{
            top1++ ;
            arr[top1] = val ;
        }
    }
//    push for stack 2
    void push2( int val ){
        if( top2 - top1 <=1 ){
            System.out.println("stack2 is full");
        }else{
            top2-- ;
            arr[top2] = val ;
        }
    }
//    pop for stack 1
    void pop1(){
        if( top1 == -1 ){
            System.out.println("stack1 is empty");
        }else{
            top1-- ;
        }
    }
//    pop for stack 2
    void pop2(){
        if( top2 == size ){
            System.out.println("stack 2 is empty");
            return;
        }
        top2++ ;
    }
}
class Main{
    public static void main(String[] args) {
        TwoStacksInArray s1 = new TwoStacksInArray();
        s1.push1(7);
        s1.push1(4);
        s1.push2(8);
        s1.push2(9);
        s1.push2(6);
//        s1.push2(10);
    }
}
