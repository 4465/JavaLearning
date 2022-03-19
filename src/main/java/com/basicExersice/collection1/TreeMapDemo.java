package com.basicExersice.collection1;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("orange", 1);
        map.put("apple", 1);
        map.put("pear", 1);
        for (String key: map.keySet()){
            System.out.println(key);
        }

        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        map1.put(56,1);
        map1.put(5,1);
        map1.put(46,1);
        map1.put(96,2);
        map1.put(156,1);

        for (Integer key: map1.keySet()){
            System.out.println(key + " " + map1.get(key));
        }
    }
}
