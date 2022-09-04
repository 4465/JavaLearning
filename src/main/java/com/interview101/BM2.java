package com.interview101;

import java.util.Scanner;

public class BM2 {

    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public ListNode reverseBetween (ListNode head, int m, int n) {
        if(head == null){
            return null;
        }
        ListNode vhead = new ListNode();
        vhead.next = head;
        ListNode pre = vhead;

        ListNode curr = head;
        ListNode last = new ListNode();
        ListNode ohead = new ListNode();
        int tag = 0;
        int count = 1;

        while (curr!=null){
            if(count == m){
                pre.next = null;
                ohead = curr;
                tag = 1;
            }
            else if(count == n + 1){
                last = curr.next;
                curr.next = null;
                break;
            }
            else{
                curr = curr.next;
                if(tag == 0) {
                    pre = pre.next;
                }
            }
            count++;
        }
        ListNode.print(ohead);
        ListNode nhead = reverse(ohead);
        pre.next = nhead;
        while (nhead.next!=null){
            nhead = nhead.next;
        }
        nhead.next = last;
        ListNode.print(vhead.next);
        return vhead.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM2 bm2 = new BM2();
        int N = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            ListNode node = new ListNode(a);
            cur.next = node;
            cur = cur.next;
        }
        ListNode.print(head.next);
        bm2.reverseBetween(head.next, m, n);
    }
}
