package com.interview101;

import java.util.*;

public class BM14 {
    /**
     * 奇数和偶数重排
     * @param head
     * @return
     */
    public ListNode jiouList (ListNode head) {
        // write code here
        ListNode vhead = new ListNode(-1);
        vhead.next = head;
        ListNode pre = vhead;
        ListNode curr = head;
        ListNode ohead  = new ListNode(-1);
        ListNode cur = ohead;
        while (curr!=null){
            if(curr.val %2 == 0){
                cur.next = curr;
                cur = cur.next;
                pre.next = curr.next;
                curr.next = null;
                curr = pre.next;
            }
            else {
                pre = pre.next;
                curr = curr.next;
            }
        }
        pre.next = ohead.next;
//        ListNode.print(vhead.next);
        return vhead.next;
    }

    public ListNode oddEvenList (ListNode head){
        // write code here
        ListNode vhead = new ListNode(-1);
        vhead.next = head;
        ListNode pre = vhead;
        ListNode curr = head;
        ListNode ohead  = new ListNode(-1);
        ListNode cur = ohead;
        int count = 1;
        while (curr!=null){
            if(count %2 == 0){
                cur.next = curr;
                cur = cur.next;
                pre.next = curr.next;
                curr.next = null;
                curr = pre.next;
            }
            else {
                pre = pre.next;
                curr = curr.next;
            }
            count++;
        }
        pre.next = ohead.next;
//        ListNode.print(vhead.next);
        return vhead.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM14 bm14 = new BM14();
        String[] params = sc.nextLine().trim().split(" ");
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        for (int i = 0; i < params.length; i++) {
            curr.next = new ListNode(Integer.parseInt(params[i]));
            curr = curr.next;
        }
        ListNode.print(head.next);
//        ListNode ans = bm14.jiouList(head.next);
//        ListNode.print(ans);
        ListNode res = bm14.oddEvenList(head.next);
        ListNode.print(res);
    }
}
