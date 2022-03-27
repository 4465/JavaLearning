package com.interview101;

import java.util.Scanner;

/**
 * 反转字符串
 */
public class BM91 {

    public String solve (String str) {
        // write code here
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        BM91 bm91 = new BM91();
        bm91.solve(str);
    }
}
