package com.company.netstat;

import java.util.Scanner;

public class Main_3 {
    public int minJump(int[] jump) {
        int[] dp = new int[jump.length];
        dp[jump.length - 1] = 1;
        for(int i = jump.length - 2; i > -1; --i){
            dp[i] = jump[i] + i >= jump.length ? 1 : dp[jump[i] + i] + 1;
            for(int j = i + 1; j < dp.length && dp[j] >= dp[i] + 1; ++j){
                dp[j] = dp[i] + 1;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Main_3 main = new Main_3();
        System.out.println(main.minJump(arr));

    }

}
