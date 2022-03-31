package com.interview101;

import java.util.*;

public class BM11 {
    public ListNode reverse(ListNode head){
        if(head == null){
            return null;
        }

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    /**
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;
        head1 = reverse(head1);
        head2 = reverse(head2);

        ListNode res = new ListNode(-1);
        ListNode head = res;
        int tag = 0;
        while (head1 != null || head2 != null || tag != 0){
            int val1 = head1 == null?0:head1.val;
            int val2 = head2 == null?0:head2.val;

            int temp = val1 + val2 + tag;
            temp = temp % 10;
            head.next = new ListNode(temp);
            head = head.next;
            if(head1!=null)
                head1 = head1.next;
            if(head2 != null)
                head2 = head2.next;
        }
        return reverse(res.next);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM11 bm11 = new BM11();
        String[] params1 = sc.nextLine().trim().split(" ");
        String[] params2 = sc.nextLine().trim().split(" ");
        int len1 = params1.length, len2 = params2.length;
        ListNode head1 = new ListNode();
        ListNode head2 = new ListNode();
        ListNode cur1 = head1;
        ListNode cur2 = head2;
        for (int i = 0; i < len1; i++) {
            ListNode node = new ListNode(Integer.parseInt(params1[i]));
            cur1.next = node;
            cur1 = cur1.next;
        }
        for (int i = 0; i < len2; i++) {
            ListNode node = new ListNode(Integer.parseInt(params2[i]));
            cur2.next = node;
            cur2 = cur2.next;
        }
        ListNode.print(head1.next);
        ListNode.print(head2.next);
        ListNode res1 = bm11.reverse(head1.next);
        ListNode res2 = bm11.reverse(head2.next);
        ListNode.print(res1);
        ListNode.print(res2);
        ListNode ans =bm11.addInList(res1, res2);
        ListNode.print(ans);

    }
}
