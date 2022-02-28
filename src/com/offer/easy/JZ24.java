package com.offer;

import java.util.List;

public class JZ24 {
    public ListNode ReverseList(ListNode head) {
        if(head.next == null) return head;
        ListNode curr = head;
        ListNode pre = null;
        ListNode next = curr.next;
        if(head != null){
            while (curr!=null){
                curr.next = pre;
                pre = curr;
                curr = next;
                next = curr.next;
            }
            head = pre;
        }
        return head;
    }

}
