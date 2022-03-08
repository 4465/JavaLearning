package com.offer.easy;

import com.offer.ListNode;

import java.util.HashMap;

public class NC4 {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        if(head == null || head.next == null)
            return false;
        ListNode curr = head;
        while(curr!=null){
            if(curr.next == null)
                return false;
            if(map.containsKey(curr)){
                return true;
            }else{
                map.put(curr, 1);
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head){
        //快慢指针

        if(head == null || head.next == null)
            return false;
        ListNode fast=head.next,slow=head;
        while(fast!=null&&fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
