package com.dhruv.linkedList;

public class LL {
    Node head ;
    Node tail ;
    int size = 0 ;

    void insertFirst( int val ){
        Node node  = new Node(val);
        node.next = head ;
        head = node ;
        if( tail == null ){
            tail = node ;
        }
        size++ ;
    }
    void display(){
        Node temp = head ;
        while ( temp != null ){
            System.out.print(temp.val +" -> ");
            temp = temp.next ;
        }
        System.out.println("END");
    }
    void insertLast(int val){
        Node node  = new Node( val );
        if( tail == null ){
            tail = node ;
            head = node;
            size++ ;
            return;
        }
        tail.next = node ;
        tail = node ;
        size++ ;
    }
    void insert( int index, int val){
        if( index == 0 ){
            insertFirst(val);
            return;
        }
        if( index == size ){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head ;
        for (int i = 1; i < index; i++) {
            temp = temp.next ;
        }
        node.next = temp.next;
        temp.next = node ;
        size++ ;
    }
    public int deleteFirst(){
        int val = head.val ;
        if( head != null ){
            head = head.next ;
        }
        if( head == null ){
            tail = null ;
        }
        size-- ;
        return val ;
    }
    public void deleteLast(){
        Node temp = head;
        if( size == 1 ){
            deleteFirst();
        }
        Node sl = getNode(size-2) ;
        sl.next = null ;
        tail = sl ;
    }
    public Node getNode( int index ){
        Node node = head;
        for( int i = 0 ; i<index ; i++ ){
            node = node.next ;
        }
        return node ;
    }
    public void deleteNode( int index ){
        if( index == 0 ){
            deleteFirst();
        }
        if( index == size-1 ){
            deleteLast();
        }
        Node prev = getNode(index-1);
        prev.next = prev.next.next ;
        size-- ;
    }
    public Node findNode( int value ){
        Node temp = head ;
        while( temp != null ){
            if( temp.val == value ){
                return temp ;
            }
            temp = temp.next ;
        }
        return null ;
    }



    private class Node{
        int val ;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}
