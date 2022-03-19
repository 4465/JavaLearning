package com.basicExersice.collection1;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        deque.push(45);
        deque.push(41);
        deque.push(90);
        System.out.println(deque);
        System.out.println(deque.hashCode());

        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(74);
        linkedList.add(17);
        linkedList.add(96);
        linkedList.add(45);
        System.out.println(linkedList);

        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

        System.out.println(linkedList.contains(17));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.indexOf(45));
        System.out.println(linkedList.lastIndexOf(96));


        linkedList.offerFirst(95);
        linkedList.offerLast(97);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);



    }
}
