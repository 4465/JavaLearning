package com.algorithm.easy;

import com.algorithm.ListNode;

import java.util.HashMap;

public class NC66 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode curr1 = pHead1, curr2 = pHead2;
        int order = 0;
        while(curr1 != null){
            if(!map.containsKey(curr1)){
                map.put(curr1, order);
                order += 1;
            }
            curr1 = curr1.next;
        }
        while (curr2!=null){
            if(map.containsKey(curr2)){
                return curr2;
            }
            curr2 = curr2.next;
        }
        return null;
    }
}
