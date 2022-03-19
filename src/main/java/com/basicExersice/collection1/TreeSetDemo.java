package com.basicExersice.collection1;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(54);
        set.add(4);
        set.add(94);
        set.add(56);
        for(Integer item: set){
            System.out.println(item);
        }
    }
}
