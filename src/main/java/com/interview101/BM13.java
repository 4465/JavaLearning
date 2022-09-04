package com.interview101;

import java.util.*;



public class BM13 {
    public ListNode reverse(ListNode head){
        if(head == null) {
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
//        ListNode.print(pre);
        return pre;
    }

    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        ListNode temp = new ListNode(-1);
        ListNode cur = temp;
        ListNode curr = head;
        while (curr != null){
            cur.next = new ListNode(curr.val);
            curr = curr.next;
            cur = cur.next;
        }
//        ListNode.print(temp.next);
        ListNode vhead = reverse(temp.next);
//        ListNode.print(head);
//        ListNode.print(vhead);
        while (vhead!=null){
            if(vhead.val != head.val){
                return false;
            }
            head = head.next;
            vhead = vhead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BM13 bm13 = new BM13();

        String[] params = sc.nextLine().trim().split(" ");
        int len = params.length;
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        for (int i = 0; i < len; i++) {
            ListNode node = new ListNode(Integer.parseInt(params[i]));
            cur.next = node;
            cur = cur.next;
        }
        ListNode.print(head.next);
//        bm13.reverse(head.next);
        System.out.println(bm13.isPail(head.next));

    }
}
