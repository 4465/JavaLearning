package com.offer.meituan;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();
//        char[] chs1 = str1.toCharArray();
//        char[] chs2 = str2.toCharArray();
        LinkedList<Character> list1 = new LinkedList<>();
        LinkedList<Character> list2 = new LinkedList<>();
        for (int i = 0; i < str1.length(); i++) {
            list1.addLast(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            list2.addLast(str2.charAt(i));
        }

        HashMap<String,Integer> map = new HashMap<>();
        for(int i = list2.size(); i<=list1.size();i++){
            for (int j = 0; j < list1.size() - i +1; j++) {
                int index1 = 0, index2 = 0;
                String str = "";

                while (index2<i){
                    if(list1.get(j+index2) == list2.get(index1)){
                        index1++;
                        str+=list1.get(j+index1);
                        if(index1 == list2.size()){
                            map.put(str, 1);
                            count++;
                            break;
                        }
                    }
                    index2++;
                }
            }
        }
        System.out.println(count);
    }
}
