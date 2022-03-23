package com.interview101;

import java.util.Scanner;

public class BM1 {

    public static ListNode Solution(ListNode head){
        if(head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = pre;
            if(cur == head.next){
                pre.next = null;
            }
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode root = new ListNode();
        ListNode cur = root;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            ListNode node = new ListNode(n);
            cur.next = node;
            cur = cur.next;
        }
        sc.nextLine();

        ListNode pRoot = BM1.Solution(root.next);
        while (pRoot != null){
            System.out.println(pRoot.val);
            pRoot = pRoot.next;
        }
    }
}
