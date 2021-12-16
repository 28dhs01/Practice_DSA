package com.dhruv.linkedList;

public class CLL {
    Node head ;
    Node tail ;

    public void insert(int value){
        Node node = new Node( value ) ;
        if( tail == null ){
            head =node ;
            tail = node ;
            return;
        }
        tail.next = node ;
        node.next = head ;
        tail = node ;
    }
    public void display( ){
        Node temp = head ;
        if( head != null ){
            do{
                System.out.print(temp.val +" -> ");
                temp = temp.next ;
            }while ( temp != head );
            System.out.println("HEAD");

        }
    }
    public void delete( int value ){
        if( head == null ){
            System.out.println("LL is empty");
            return;
        }
        if( value == head.val ){
            // delete head
            tail.next = head.next ;
            head = head.next ;
            return;
        }
        Node temp = head;
        do{
            Node n = temp.next ;
            if( n.val == value ){
                temp.next = n.next ;
                break;
            }
            temp = temp.next ;
        }while ( temp != head  );


    }

   private class Node {
       int val ;
       Node next ;

       public Node(int val) {
           this.val = val;
       }
   }
}
