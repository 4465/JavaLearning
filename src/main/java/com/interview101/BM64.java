package com.interview101;


import java.util.*;

public class BM64 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param cost int整型一维数组
     * @return int整型
     */
    public int minCostClimbingStairs (int[] cost) {
        // write code here
        int len = cost.length;
        if (len==0) return 0;
        if (len==1) return cost[0];
        int[] dp = new int[len+1];
        for (int i = 2; i <= len; i++) {
            dp[i] = Math.min(dp[i-1] + cost[i-1], dp[i-2] + cost[i-2]);
        }
        return dp[cost.length];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] params = sc.nextLine().trim().split(" ");
            int n = params.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(params[i]);
            }
            System.out.println(new BM64().minCostClimbingStairs(arr));
        }
    }
}
