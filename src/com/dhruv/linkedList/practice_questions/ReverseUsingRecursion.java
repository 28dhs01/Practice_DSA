package com.dhruv.linkedList.practice_questions;

public class ReverseUsingRecursion {
    Node head;
    Node tail;

     void reverse(Node node ){
        // base case
        if( node == tail ){
            head = node  ;
            return ;
        }
        // body and calls
         reverse(node.next);
        tail.next = node ;
        tail = node ;
        tail.next = null ;
    }



}

