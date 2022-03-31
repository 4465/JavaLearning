package com.interview101;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){

    }

    public ListNode(int val){
        this.val = val;
        this.next = null;
    }

    public static void print(ListNode node){
        while (node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
