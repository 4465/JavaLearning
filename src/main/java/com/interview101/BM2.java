package com.interview101;

import java.util.Scanner;

public class BM2 {
    public static ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if(head == null){
            return null;
        }
        if(n>m){ return null;}
        ListNode curr = head;
        int cnt = 1;
        while (curr != null){
            if(cnt == m){
                //开始反转
                break;
            }
            cnt ++;
            curr = curr.next;
        }
        ListNode pre = curr;
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int i = 0; i < N; i++) {
            n = sc.nextInt();
            ListNode node = new ListNode(n);
            cur.next = node;
            cur = cur.next;
        }
        BM2.reverseBetween(head.next,m,n);
    }
}
