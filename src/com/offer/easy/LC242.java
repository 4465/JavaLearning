package com.offer.easy;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LC242 {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        s =s.toLowerCase(Locale.ROOT);
        t = t.toLowerCase(Locale.ROOT);
        if(s.length() != t.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), 1);
            }
            else{
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            }
        }
        for(Character key:map.keySet()){
//            System.out.println("key:" + key + "value:" + map.get(key));
//            System.out.println("key:" + key + "value:" + map2.get(key));
//            System.out.println("====================");
            if(map.get(key) != map2.get(key)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        LC242 IA = new LC242();
        IA.isAnagram(s,t);

    }
}
