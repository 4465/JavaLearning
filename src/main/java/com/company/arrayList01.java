package com.company;

import java.util.ArrayList;


public class arrayList01 {
    public static void main(String[] args){
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Liu");
        sites.add("wei");
        sites.add("fu");

        // 访问元素
        System.out.println(sites);
        System.out.println(sites.get(2));
        System.out.println(sites.size());

        // 修改元素
        sites.set(1, "su");
        System.out.println(sites);

        // 删除元素
        sites.remove(3);
        System.out.println(sites);

        System.out.println(sites.size());

        // 迭代数组列表
        for(int i=0; i< sites.size();i++){
            System.out.println(sites.get(i));
        }

        for(String s : sites){
            System.out.println(s);
        }
    }
}
