package com.offer.tenxun;

import java.util.Arrays;
import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];

        int len = 0;

        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
            len = Math.max(len, str[i].length());
        }

        String[] nums = new String[len];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < len; j++) {
                if(i==0)
                    nums[j] = str[i].substring(j,j+1);
                else
                    nums[j] += str[i].substring(j,j+1);
            }
        }

        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = Integer.parseInt(nums[i]);
        }

        Arrays.sort(res);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}

