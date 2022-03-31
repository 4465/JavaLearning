package com.interview101;

import java.util.*;

public class BM9 {

    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode vhead = new ListNode();
        vhead.next = head;
        head = vhead;
        ListNode fast = head.next;
        ListNode slow = head.next;
        ListNode pre = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
            pre = pre.next;
        }
//        slow.next = null;
        pre.next = pre.next.next;

        return head.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM9 bm9 = new BM9();
        while (sc.hasNextLine()){
            String[] params = sc.nextLine().trim().split(" ");

            int n = sc.nextInt();
            ListNode head = new ListNode();
            ListNode cur  = head;
            int len = params.length;
            for (int i = 0; i < len; i++) {
                ListNode node = new ListNode(Integer.parseInt(params[i]));
                cur.next = node;
                cur = cur.next;
            }
            ListNode.print(head.next);
            ListNode res = bm9.removeNthFromEnd(head.next, n);
            ListNode.print(res);
        }
    }
}
