package com.dhruv.linkedList.practice_questions;

public class BubbleSort {
    Node head ;
    Node tail ;
    int size ;
    // insert , get and display methods are required

    void insertFirst(int value){
        Node node = new Node(value) ;
        if( head == null ){
            head = node ;
            tail = node ;
            size++ ;
            return;
        }
        node.next = head ;
        head = node ;
        size++ ;
    }
    void insertLast( int value ){
        Node node = new Node(value) ;
        if( head == null ){
            insertFirst(value);
            return;
        }
        tail.next = node ;
        tail = node ;
        tail.next = null ;
        size++ ;
    }
    public Node get(int index){
        Node temp = head ;
        for (int i = 0; i < index; i++) {
            temp = temp.next ;
        }
        return temp ;
    }
    public void display(){
        Node temp = head ;
        while( temp != null ){
            System.out.print(temp.val +" -> ");
            temp = temp.next ;
        }
        System.out.println("END");
    }

    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row, int col){
        if( row == 0 ){
            return ;
        }
        if( col < row ){
            Node first = get(col);
            Node second = get(col+1);
            if( first.val > second.val ){
                if( first == head ){
                    head = second ;
                    first.next = second.next;
                    second.next = first ;
                }
                else if( second == tail ){
                    Node prev = get(col-1);
                    prev.next = second ;
                    tail = first ;
                    first.next = null ;
                    second.next = tail ;
                }
                else{
                    Node prev = get(col-1) ;
                    prev.next = second ;
                    first.next = second.next ;
                    second.next = first ;
                }
            }
            bubbleSort(row,col+1);
        }
        else{
            bubbleSort(row-1,0);
        }
    }

    public static void main(String[] args) {
        BubbleSort list = new BubbleSort() ;
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.display();
        list.bubbleSort();
        list.display();
    }
}
class Node{
    int val ;
    Node next ;

    public Node(int val) {
        this.val = val;
    }
}
