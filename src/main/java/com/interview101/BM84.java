package com.interview101;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最长公共前缀
 */
public class BM84 {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        int size = strs.length;
        if(size == 0){
            return "";
        }
        if(size == 1){
            return strs[0];
        }
        String ans = "";
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        for (int i = 0; i < minLen; i++) {
            char ch = strs[0].charAt(i);
            int j;
            for (j = 0; j < size; j++) {
                if(ch!=strs[j].charAt(i)){
                    break;
                }
            }
            if(j==size){
                ans += ch;
            }else {
                break;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String[] strs = new String[n];
            sc.nextLine();
            for (int j = 0; j < n; j++) {
                strs[j] = sc.nextLine().trim();
            }
            System.out.println(Arrays.toString(strs));
            BM84 bm84 = new BM84();
            String ans = bm84.longestCommonPrefix(strs);
            System.out.println(ans);
        }
    }
}
