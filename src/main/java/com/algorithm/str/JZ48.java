package com.algorithm.str;

import java.util.HashMap;
import java.util.Scanner;

public class JZ48 {

    public int lengthOfLongestSubstring (String s) {
        // write code here
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = s.toCharArray();
        int left = 0, maxLength = 0;
        for (int i = 0; i < chars.length; i++){
            if (hashMap.containsKey(chars[i])){
                left = Math.max(left, hashMap.get(chars[i]) + 1);
            }
            hashMap.put(chars[i], i);
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        JZ48 jz48 = new JZ48();
        int ans = jz48.lengthOfLongestSubstring(input);
        System.out.println(ans);
    }
}
