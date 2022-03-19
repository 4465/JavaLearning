package com.basicExersice.collection1;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class WeekHashSetDemo {


    public static void main(String[] args) {
        Set<Object> weakHashSet = Collections.newSetFromMap(new WeakHashMap<>());
        weakHashSet.add(44);
        weakHashSet.add(99);
        weakHashSet.add(88);
        weakHashSet.add(44);
        System.out.println(weakHashSet);
    }
}
