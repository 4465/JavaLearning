package com.interview101;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 最小覆盖字串
 */
public class BM90 {
    public String minWindow (String S, String T) {
        // write code here
        LinkedList<Integer> list = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            if(!map.containsKey(T.charAt(i))){
                map.put(T.charAt(i), 1);
            }
        }
        for (int i = 0; i < S.length(); i++) {

        }
        return "";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        String T = sc.nextLine().trim();

    }
}
