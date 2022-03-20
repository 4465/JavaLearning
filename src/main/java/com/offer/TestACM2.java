package com.offer;

import java.util.Scanner;

public class TestACM2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);// cin是自己定义的，这个是任意的
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
        }
    }
}
