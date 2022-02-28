package com.offer;

import java.util.*;

public class JZ23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ArrayList<ListNode> nodeList = new ArrayList<>();
        HashMap<ListNode, Integer> nodeMap = new HashMap<>();
        ListNode curr = pHead;
        while(curr != null){
            if(nodeMap.containsKey(curr)){
                return curr;
            }
            else{
                nodeMap.put(curr,0);
                curr = curr.next;
            }

        }
        return null;
    }

}
