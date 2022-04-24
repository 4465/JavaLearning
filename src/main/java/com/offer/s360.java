package com.offer;

import java.util.*;


class Solution {
    public boolean isPalindrome(String s){
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        int l = 0;
        int r = s.length() -1;
        while (l <= r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        String maxStr = "";
        for(int i = 0; i< len; i++){
            int l = i;
            int r = i;
            while (l >= 0 && r <= len-1) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }else {
                    break;
                }
            }
            String temp = s.substring(l+1, r);
            if(temp.length() > maxStr.length()){
                maxStr = temp;
            }
        }
        return maxStr;
    }


}


public class s360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        Solution sol = new Solution();
        String ans = sol.longestPalindrome(str);
        System.out.println(ans);
    }
}
