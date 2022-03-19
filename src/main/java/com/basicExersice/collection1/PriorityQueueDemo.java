package com.basicExersice.collection1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "/" + number;
    }
}

class UserComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
            return u1.number.compareTo(u2.number);
        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        // 添加3个元素到队列:
        queue.offer("apple");
        queue.offer("pear");
        queue.offer("banana");
        System.out.println(queue.poll()); // apple
        System.out.println(queue.poll()); // banana
        System.out.println(queue.poll()); // pear
        System.out.println(queue.poll()); // null,因为队列为空


        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        System.out.println(q.poll()); // Boss/V1
        System.out.println(q.poll()); // Bob/A1
        System.out.println(q.poll()); // Alice/A2
        System.out.println(q.poll()); // null,因为队列为空
    }
}
