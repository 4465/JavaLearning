package com.interview101;

import java.util.Scanner;

public class BM88 {
    public boolean judge (String str) {
        // write code here
        StringBuilder sb = new StringBuilder(str).reverse();
        if(sb.toString().equals(str)){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        BM88 bm88 = new BM88();
        bm88.judge(input);
    }
}
