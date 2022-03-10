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
        ListNode vhead = new ListNode(0);
        vhead.next = head;
        ListNode pre = vhead;
        while (head!= null){
            System.out.println(head.val);
            if(map.containsKey(head.val)){
                head = head.next;
                pre.next = head;
            }else{
                map.put(head.val, 1);
                pre = head;
                head = head.next;
            }
        }
        return vhead.next;
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
        (new BM15()).deleteDuplicates(head.next);
    }
}
