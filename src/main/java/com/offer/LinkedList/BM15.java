package com.offer.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class BM15 {
    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        // write code here

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode pre = head;
        ListNode curr = head.next;
        map.put(head.val, 1);
        while (curr != null){

            if(map.containsKey(curr.val)){
                curr = curr.next;
                pre.next = curr;
            }else{
                map.put(curr.val, 1);
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for (int i = 0; i < n; i++) {
            ListNode temp = new ListNode(nums[i]);
            curr.next = temp;
            curr = curr.next;
            if(i == n-1){
                curr.next = null;
            }
        }
        ListNode result = (new BM15()).deleteDuplicates(head.next);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
