package com.offer;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class JZ18 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param head ListNode类
     * @param val int整型
     * @return ListNode类
     */
    public ListNode deleteNode (ListNode head, int val) {
        // write code here
        ListNode pre = null;
        ListNode next = null;
        ListNode curr = head;
        while(curr!=null){
            if(val==curr.val){
                if(curr==head){
                    curr=curr.next;
                    head = curr;

                }
                else{
                    pre.next = curr.next;
                    curr = curr.next;

                }
            }
            else{
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}