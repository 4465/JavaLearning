package com.offer.meituan;

import java.util.*;
import java.util.regex.Pattern;

public class Main_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str1 = sc.nextLine().trim();
        String str2 = sc.nextLine().trim();
        String pattern = ".*" + str2 + ".*";
        boolean isMatch = Pattern.matches(pattern, str1);

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.substring(0, i) + " " + str1.substring(i+1, str1.length()));
                String content = str1.substring(0, i) + str1.substring(i+1,str1.length());
//                System.out.println(content);
                if(Pattern.matches(pattern, content)){
                    count++;

            }
        }

//        System.out.println(isMatch);

        System.out.println(count);
    }
}
