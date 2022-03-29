package com.bishi.baidu;

import java.util.*;

public class Main_2 {
    public int reverse(int a, int b){
        int num = a*b;
        StringBuilder strNum = new StringBuilder(Integer.toString(num));
        return Integer.parseInt(strNum.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main_2 main = new Main_2();
//        System.out.println(main.reverse(8,9));
        while (sc.hasNextLine()){
            String[] params = sc.nextLine().trim().split(" ");
            int N = Integer.parseInt(params[0]);
            int T = Integer.parseInt(params[1]);
            int[] ans = new int[N*T + 1];
            for (int i = N; i <= N; i++) {
                for (int j = 1; j <= T; j++) {
                    ans[i*j] = main.reverse(i, j);
                }
            }
//            for (int i = N; i <= N; i++) {
//                for (int j = 1; j <= T; j++) {
//                    System.out.println(ans[i*j]);
//                }
//            }
            int max = Integer.MIN_VALUE;
            for(int i = 1;i<T;i++){
                max = Math.max(max, ans[N*i]);
            }
            System.out.println(max);
        }
    }
}
