package com.offer.easy;



import com.offer.ListNode;

import java.util.ArrayList;






public class JZ6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ll = new ArrayList<Integer>();

        if(listNode == null){
            return null;
        }
        ListNode cur = listNode;
        while(cur != null){
            ll.add(0, cur.val);
            cur = cur.next;
        }
        return ll;
    }
}
