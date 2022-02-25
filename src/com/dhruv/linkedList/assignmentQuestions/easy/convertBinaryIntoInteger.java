package com.dhruv.linkedList.assignmentQuestions.easy;

public class convertBinaryIntoInteger {

    public int getDecimalValue(ListNode head){
        ListNode temp1 = head;
        int length = 0 ;
        while ( temp1 != null ){
            length ++ ;
            temp1 = temp1.next ;
        }
        ListNode temp2 = head;
        int ans  = 0 ;
        while( temp2 != null ){
            ans += temp2.val*Math.pow(2,length-1);
            length-- ;
            temp2 = temp2.next ;
        }
        return ans;

    }
}
class ListNode{
    int val;
    ListNode next;
}
