package com.offer;

import java.util.*;

public class s360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            long res = 0;
            for (int j = i; j < N; j++) {

                if(i == j){
                    res = arr[j];
                }
                else{
                    res = arr[i] | arr[j];
                }
                ans += res;
//                System.out.println("打中" + i + "号气球和" + j + "号气球,得分" + res + "分");
            }
        }
        System.out.println(ans);
    }
}
