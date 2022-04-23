package com.basicExersice.bit;

import java.util.Scanner;

public class Demo2 {
    public static String addBinary(String a, String b) {
        Long aa = Long.parseLong(a,2);
        Long bb = Long.parseLong(b,2);
//        System.out.println(aa);
//        System.out.println(bb);
        return Long.toBinaryString(aa + bb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(addBinary(a, b));
        }
    }
}
