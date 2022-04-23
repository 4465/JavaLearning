package com.offer.bit;

import java.util.*;

public class OverrideMax {

    public static int getWeight(int n){
        return n ^ 1;
    }

    public static int getSign(int n){
        return (n >> 31) & 1;  // 正数符号位为1,返回1，负数符号位为0，返回0
    }


    public static int max(int a, int b){
        int c = a - b;
        int sign = OverrideMax.getSign(c);
//        int weight = OverrideMax.getWeight(sign);
        return b * sign + a * (1 -sign);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Integer.toBinaryString(a));
            System.out.println(Integer.toBinaryString(b));
            System.out.println(Integer.toHexString(a));
            System.out.println(OverrideMax.max(a, b));
        }

    }
}
