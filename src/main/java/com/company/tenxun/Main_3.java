package com.company.tenxun;//package com.offer.tenxun;
//
//import java.util.*;
//
//public class Main4 {
//    public static void main(String[] args) {
//
//    }
//
//    public ListNode solve (ListNode[] a) {
//        // write code here
//        List<Integer> list = new ArrayList<>();
//        int min = Integer.MAX_VALUE;
//        int index = 0;
//        int i = 0;
//        for(ListNode head:a){
//            while(head.next!=null){
//                if(!list.contains(head.val)){
//                    list.add(head.val);
//                    if(head.val<min){
//                        min  = head.val;
//                        index = i;
//                    }
//                    i++;
//                }
//                head = head.next;
//            }
//        }
//        ListNode head = new ListNode(list.get(index));
//        ListNode temp = head;
//        if(index>=1 && list.size()>=3 && list.get(index-1)>list.get(index+1)){
//            int j = index+1;
//            while(j<list.size()){
//                ListNode cur = new ListNode(list.get(j));
//                temp.next = cur;
//                temp = cur;
//                j++;
//            }
//            j = 0;
//            while(j<index){
//                ListNode cur = new ListNode(list.get(j));
//                temp.next = cur;
//                temp = cur;
//                j++;
//            }
//        }else{
//            int j = index-1;
//            while(j>=0){
//                ListNode cur = new ListNode(list.get(j));
//                temp.next = cur;
//                temp = cur;
//                j--;
//            }
//            j = list.size()-1;
//            while(j>index){
//                ListNode cur = new ListNode(list.get(j));
//                temp.next = cur;
//                temp = cur;
//                j--;
//            }
//        }
//        return head;
//    }
//}
