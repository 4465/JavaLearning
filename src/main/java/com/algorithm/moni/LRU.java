package com.algorithm.moni;

import java.util.*;
public class LRU {

    private int capacity;
    private LinkedHashMap<Integer, Integer> map;

    public LRU(int capacity) {
        // write code here
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);
    }

    public synchronized int get(int key) {
        // write code here
        Integer value = map.get(key);
        if(value!=null){
            if(map.size()>1){
                map.remove(key);
                map.put(key, value);
            }
        }
        else {
            return -1;
        }
        return value;
    }

    public synchronized void set(int key, int value) {
        // write code here
        if(map.size()>=capacity){
            System.out.println(map.keySet().iterator().next());
            map.remove(map.entrySet().iterator().next().getKey());
        }

        map.put(key, value);

    }

    public void print(){
        System.out.println(map.toString());
    }


    public static void main(String[] args) {
        LRU lru = new LRU(2);
        int output;
        lru.set(1,1);
        lru.set(2,2);
        lru.print();
        output = lru.get(1);
        lru.print();
        System.out.println(output);
        lru.set(3,3);
        lru.print();
        System.out.println(lru.get(2));


    }
}
