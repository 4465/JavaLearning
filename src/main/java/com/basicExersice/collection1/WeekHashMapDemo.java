package com.basicExersice.collection1;

import java.util.WeakHashMap;

public class WeekHashMapDemo {

    public static void main(String[] args) {
        WeakHashMap<Integer, Integer> map = new WeakHashMap<>();

        map.put(12,1);
        map.put(2,2);
        map.put(3,1);
        map.put(5,1);
        System.out.println(map.size());
        System.out.println(map);
    }
}
