package com.interview101;

import java.util.*;

public class BM12 {
    /**
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList (ListNode head) {
        // write code here
        if(head == null){
            return null;
        }
        int min = Integer.MAX_VALUE;
        ListNode curr = head;
        ListNode vhead = new ListNode(-1);
        ListNode cur = vhead;
        int n = 0;
        while (curr!=null){
            curr = curr.next;
            n++;
        }
        curr = head;
        for (int i = 0; i < n; i++) {

        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM12 bm12 = new BM12();
    }
}
