package com.dhruv.linkedList;

public class DLL {
   Node head ;
   public void insertFirst(int value){
       Node node = new Node(value) ;
       node.next = head;
       node.prev = null ;
       if( head != null ){
           head.prev = node ;
       }
       head = node ;
   }
   public void display(){
       Node temp = head ;
       while( temp != null ){
           System.out.print(temp.val +" -> ");
           temp = temp.next ;
       }
       System.out.println("END");

   }
   public void displayRev(){
       Node temp = head ;
       if( head != null ){
           while( temp.next != null ){
               temp = temp.next ;
           }
       }
       while (temp != null ){
           System.out.print(temp.val +" -> ");
           temp = temp.prev ;
       }
       System.out.println("START");
   }
   public void insertLast(int value){
       Node node = new Node ( value ) ;
       node.next = null ;
       if( head == null ){
           node.prev = null ;
           head = node ;
           return;
       }
       Node last = head ;
       while( last.next != null ){
           last = last.next ;
       }
       last.next = node ;
       node.prev = last ;
   }
   public void insertAfter( int after, int value){
       Node node = new Node(value) ;
       Node temp = head ;
       while( temp != null  ){
           if( temp.val == after ){
               break;
           }
           temp = temp.next ;
       }
       if ( temp == null ){
           System.out.println("After node not found");
           return;
       }
       node.next = temp.next ;
       node.prev = temp ;
       temp.next = node;
       if( node.next != null ){
           node.next.prev = node;
       }

   }

   private class Node{
       int val ;
       Node next ;
       Node prev ;

       public Node() {
       }

       public Node(int val) {
           this.val = val;
       }
   }
}
