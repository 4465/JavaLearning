package com.basicExersice.generics;

import java.util.HashMap;

public class ClassDemo<K, V> {
    private K key;

    private V value;


    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "ClassDemo{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        ClassDemo<String, Integer> cd = new ClassDemo<>();
        ClassDemo2<HashMap<String,Integer>> cd2 = new ClassDemo2<>();

        cd.setKey("张三");
        cd.setValue(15);

        System.out.println(cd);


        HashMap<String,Integer> map = new HashMap<>();
        map.put("王五", 55);
        cd2.setVal(map);

        System.out.println(cd2);
    }

}

class ClassDemo2<T>{
    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ClassDemo2{" +
                "val=" + val +
                '}';
    }
}
