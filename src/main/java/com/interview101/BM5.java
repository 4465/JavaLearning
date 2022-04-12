package com.interview101;

import java.util.*;

public class BM5 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        if(list1==null)
            return list2;
        if(list2 == null)
            return list1;
        while (list1!=null || list2!= null){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }
            if(list1 == null){
                cur.next = list2;
                break;
            }
            if(list2 == null){
                cur.next = list1;
                break;
            }
        }
        return head.next;
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size() == 0)
            return null;
        ListNode head = new ListNode(-1);
        head = Merge(head.next, lists.get(0));
        for (int i = 1; i < lists.size(); i++) {
            head = Merge(head, lists.get(i));
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
