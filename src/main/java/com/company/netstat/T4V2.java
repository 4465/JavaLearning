package com.company.netstat;

import java.util.Scanner;

public class T4V2 {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int m = s.nextInt();
            boolean[] arr = new boolean[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = true;
            } // 数组赋值都是true

            int leftCount = n;
            int countNum = 0;
            int index = 0;
            while (leftCount > 1) {
                if (arr[index] == true) {
                    countNum++;
                    if (countNum == m) {
                        countNum = 0;
                        arr[index] = false;
                        leftCount--;
                    }
                }
                index++;
                if (index == n) {
                    index = 0;
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] == true) {
                    System.out.println(i+1);
                }
            }
        }
}
