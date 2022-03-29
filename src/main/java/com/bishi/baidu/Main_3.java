package com.bishi.baidu;

import java.util.*;

public class Main_3 {

    public static boolean panduan(String s){
        char[] chs = s.toCharArray();
        int len = chs.length;
        for (int i = 0; i < len-1; i++) {
            if(chs[i+1] < chs[i]){
                return false;
            }
        }
        return true;
    }

    public static String getReverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
    private static int ans;
    public static int sol(String s){
        int ans = 0;
        int len = s.length();

        if (panduan(s) != true) {
            return 0;
        }

        return  ans;
    }

    public static int getReverseNum(String s){
        int ans = 0;
        if (panduan(s) != true) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i) < s.charAt(j)){
                    ans ++ ;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("ABABC".substring(0, 1));
        int N = sc.nextInt();
        int Q = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().trim();
        System.out.println(Main_3.sol(str));
    }

}
