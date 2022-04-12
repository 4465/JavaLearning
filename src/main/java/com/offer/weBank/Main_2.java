package com.offer.weBank;

import java.util.*;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = Integer.toHexString(num);
        int len = res.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(res.charAt(i) >= 'a' && res.charAt(i) <= 'f'){
                count++;
            }
        }
        System.out.println(count);
    }
}
