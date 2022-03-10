package com.offer.LinkedList;

import java.util.HashMap;
import java.util.Scanner;

public class BM16 {

    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head == null)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode vhead = new ListNode(0);
        vhead.next = head;
        ListNode pre = vhead;
        ListNode curr = head;
        int cnt = 0;
        if(head.next==null)
            return head;

        while(curr != null){
            if(curr.next == null){
                if(cnt != 0){
                    pre.next = null;
                    break;
                }else{
                    break;
                }
            }

            if(curr.val == curr.next.val){
                cnt ++;
                curr = curr.next;
            }
            else{
                if(cnt == 0){
                    pre = curr;
                    curr= curr.next;
                }
                else {
                    curr = curr.next;
                    pre.next = curr;
                    cnt = 0;
                }
            }
        }
        return vhead.next;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ListNode temp = new ListNode(num);
            curr.next = temp;
            curr = curr.next;
        }
//        while (head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }
        ListNode result = (new BM16()).deleteDuplicates(head.next);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
