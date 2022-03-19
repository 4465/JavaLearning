package com.basicExersice.collection1;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");
        System.out.println(sites);
        System.out.println(sites.size());
        System.out.println("========================");
        for(String i : sites ){
            System.out.println(i);
        }
        System.out.println("========================");
        System.out.println(sites.contains("Taobao"));
        sites.remove("Zhihu");
        System.out.println(sites);
        sites.clear();
        System.out.println(sites);
    }
}
