package com.offer.bytedance;

import java.util.*;

public class Main_4 {
    static int w = 0;
    public static int getMaxWeight(int[][] weight){
        int n = weight.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, weight[i][0] + getMaxWeight(weight, i+weight[i][1] + 1, n-1));
        }
        return ans;
    }

    public static int getMaxWeight(int[][] weight, int i, int j){
        if(i > j)
            return 0;
        if(i==j)
            return weight[j][0];
        return weight[i][0] + getMaxWeight(weight, i+weight[i][1] + 1, j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] weights = new int[n][2];
        for (int i = 0; i < n; i++) {
            weights[i][0] = sc.nextInt();
            weights[i][1] = sc.nextInt();
        }
        int ans = Main_4.getMaxWeight(weights);
        System.out.println(ans);
    }
}
