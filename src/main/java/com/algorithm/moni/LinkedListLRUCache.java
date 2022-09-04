package com.algorithm.moni;

import java.util.*;

public class LinkedListLRUCache<K,V> {

    class LRUNode<K,V>{
        private K key;
        private V value;

        private LRUNode next;

        private LRUNode prev;


        public LRUNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;

    private Map<K,LRUNode> map;

    private LRUNode head;

    private LRUNode tail;

    public LinkedListLRUCache(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();
    }

    public void put(K k,V v){
        LRUNode node = map.get(k);

        if(node!=null){
            node.value = v;
            remove(node, false);
        }
        else {
            node = new LRUNode(k,v);
            if(map.size()>=capacity){
                remove(tail, true);
            }
            map.put(k,node);

            setHead(node);
        }
        setHead(node);
    }

    public Object get(String key) {
        LRUNode node = map.get(key);
        if (node != null) {
            // 将刚操作的元素放到head
            remove(node, false);
            setHead(node);
            return node.value;
        }
        return null;
    }


    private Iterator iterator(){
        return map.keySet().iterator();
    }

    private void setHead(LRUNode node){

    }

    private void remove(LRUNode node, boolean flag){

    }

    public static void main(String[] args) {

    }

}
