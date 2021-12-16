package com.dhruv.linkedList;

public class Main {
    public static void main(String[] args) {

//        LL list = new LL ();
//        list.insertFirst(16);
//        list.insertFirst(8);
//        list.insertFirst(4);
//        list.insertFirst(2);
//        list.insertFirst(1);
////        list.display();
////        System.out.println(list.head.val); // head and tail are generally put private
////        System.out.println(list.tail.val);
//        list.insertLast(32);
//        list.display();
//        list.insert(5,100);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.deleteNode(3);
//        list.display();
////        System.out.println(list.findNode(100).val);

        // DLL

//        DLL list = new DLL() ;
//        list.insertFirst(1);
//        list.insertFirst(8);
//        list.insertFirst(4);
//        list.insertFirst(7);
//        list.display();
//        list.insertFirst(17);
//        list.display();
//        list.displayRev();
//        list.insertLast(22);
//        list.display();
//        list.insertAfter(8,62);
//        list.display();

        // CLL


        CLL list = new CLL() ;
        list.display();
        list.insert(6);
        list.insert(4);
        list.insert(8);
        list.insert(2);
        list.display();
        list.insert(17);
        list.display();
        list.delete(6);
        list.display();
        list.delete(8);
        list.display();


    }
}
