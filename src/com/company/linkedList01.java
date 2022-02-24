package com.company;

import java.util.LinkedList;

public class linkedList01 {
    public static void main(String[] args){
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("www");
        sites.add("xfnlp");
        sites.add("com");
        sites.add("cn");
        System.out.println(sites);
        sites.addFirst("wiki");
        System.out.println(sites);
        sites.addLast("lwf");
        System.out.println(sites);
        sites.removeLast();
        System.out.println(sites);
        sites.removeFirst();
        System.out.println(sites);
        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());

        for(String s : sites){
            System.out.println(s);
        }
    }
}
