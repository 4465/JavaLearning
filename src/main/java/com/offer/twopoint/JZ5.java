package com.offer.twopoint;

import java.util.*;

public class JZ5 {

    public String replaceSpace(String s) {
        if(s == null || s.length() == 0){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        //扩充空间
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                sb.append("  ");
            }
        }
        if(sb.length()==0){
            return s;
        }

        //有空格情况，定义两个指针
        int left = s.length() -1;
        s+= sb.toString();
        int right = s.length() -1;
        char[] chars = s.toCharArray();
        while (left>0){
            if(chars[left] == ' '){
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            }
            else {
                chars[right] = chars[left];
            }
            left--;
            right--;
        }
//        System.out.println(new String(chars));
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine().trim();
            new JZ5().replaceSpace(str);
        }


    }
}
