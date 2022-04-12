package com.interview101;

import java.util.*;

public class BM3 {

    /**
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        ListNode vhead = new ListNode(-1);

        ListNode cur = head;
        int count = 0;
        while (cur!=null){
            count++;
            cur = cur.next;
        }

        cur = head;
        int[] ans = new int[count];
        int j = 0;
        while (cur!=null){
            ans[j++] = cur.val;
            cur = cur.next;
        }


        for (int i = 0; i < count; i+=k) {
            if(i+k>count){
//                reverse(ans, i, count);
            }
            else {
                reverse(ans, i, i+k);
            }
        }

        cur = vhead;
        for (int i = 0; i < ans.length; i++) {
            cur.next = new ListNode(ans[i]);
            cur = cur.next;
        }
//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i] + " ");
//        }
//        System.out.println();
        return vhead.next;
    }


    public void reverse(int[] nums, int i, int j){
        int l = i;
        int r = j-1;
        while (l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
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

        int k = sc.nextInt();
        BM3 bm3 = new BM3();
        ListNode res = bm3.reverseKGroup(head1.next, k);
        ListNode.print(res);
    }
}
