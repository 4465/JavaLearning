package com.offer.tenxun;

import java.util.*;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        LinkedList<Integer> list = new LinkedList<>();
        int len = strs[0].length();
//        System.out.println(len);
        for (int i = 0; i < len; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
//                System.out.println(strs[i].charAt(j));
                temp += strs[j].charAt(i);
            }
            list.add(Integer.parseInt(temp));
        }
        HashSet<Integer> map = new HashSet<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            if(!map.contains(list.get(i))){
                map.add(list.get(i));
                list2.add(list.get(i));
            }
        }

        Collections.sort(list2);

        for (int i = 0; i < list2.size() -1; i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println(list2.get(list2.size()-1));
//        System.out.println();
    }
}
