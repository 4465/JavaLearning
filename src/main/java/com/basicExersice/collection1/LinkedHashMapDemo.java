package com.basicExersice.collection1;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        map.put("1111", 1);
        map.put("2222", 1);
        System.out.println(map);
        int a = map.get("1111");
        System.out.println(a);
    }
}
