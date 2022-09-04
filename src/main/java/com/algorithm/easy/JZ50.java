package com.algorithm;

import java.util.HashMap;

public class JZ50 {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        for(int i=0; i<str.length();i++){
            if(charCount.containsKey(str.charAt(i))){
                charCount.put(str.charAt(i), charCount.get(str.charAt(i)) + 1);
            }
            else {
                charCount.put(str.charAt(i), 1);
            }
        }
//        int num = 0;
        int min = str.length();
        for(Character c: charCount.keySet()){
//            System.out.println(c + ": " + charCount.get(c));
//            num += 1;
            if(charCount.get(c) == 1){
                if(min > str.indexOf(c))
                    min = str.indexOf(c);
            }
        }
        System.out.println(min);
        if(min==str.length()){
            return -1;
        }
        return min;
    }


    public static void main(String[] args){
        JZ50 F = new JZ50();
        F.FirstNotRepeatingChar("google");
    }
}
