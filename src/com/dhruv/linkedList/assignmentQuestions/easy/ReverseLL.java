package com.dhruv.linkedList.assignmentQuestions.easy;

public class ReverseLL {

    ListNode reverseLL(ListNode head){
        if(head == null || head.next  == null ){
            return head;
        }
        ListNode prev = null ;
        ListNode pres = head ;
        ListNode fut = pres.next ;
        while( pres != null ){
            pres.next = prev ;
            prev = pres ;
            pres = fut ;
            if( fut != null ){
                fut = fut.next ;
            }
        }
        head = prev ;
        return head;
    }

    public class ListNode {
        int val ;
        ListNode next ;
    }
}


