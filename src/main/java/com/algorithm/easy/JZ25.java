package com.algorithm;

public class JZ25 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        int len1 = 0;
        int len2 = 0;
        ListNode head1 = list1;
        ListNode head2 = list2;
//        while(head1 != null){
//            len1 += 1;
//            head1 = head1.next;
//        }
//        while(head2 != null){
//            len2 += 1;
//            head2 = head2.next;
//        }
//        if(len1 < len2){
//            ListNode temp;
//            temp = list1;
//            list1 = list2;
//            list2 = temp;
//        }
        ListNode curr = list1;
        ListNode tmp = list2;
        while (curr != null){
            ListNode next = curr.next;
            if(next != null){
                if(tmp.val >= curr.val && tmp.val < next.val){
                    curr.next = tmp;
                    tmp = tmp.next;
                    curr.next.next = next;
                }
            }
            else{
                if(tmp.val >= curr.val)
                    curr.next = tmp;
            }
            curr = curr.next;
        }
        return list1;
    }
}
