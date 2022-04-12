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
        ListNode vhead = new ListNode(-1);
        if(head == null){
            return vhead;
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ListNode cur = head;
        while (cur!=null){
            ans.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(ans);
        cur = vhead;
        for (int i = 0; i < ans.size(); i++) {
            cur.next = new ListNode(ans.get(i));
            cur = cur.next;
        }
        return vhead.next;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().trim().split(" ");

        ListNode head1 = new ListNode(-1);

        ListNode cur1 = head1;

        for (int i = 0; i < params.length; i++) {
            cur1.next = new ListNode(Integer.parseInt(params[i]));
            cur1 = cur1.next;
        }

        BM12 bm12 = new BM12();
        ListNode ans = bm12.sortInList(head1.next);
        ListNode.print(ans);
    }

}
