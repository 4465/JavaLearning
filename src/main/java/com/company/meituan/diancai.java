package com.company.meituan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class diancai {
    private int ans = 0;


    public int getAns(int[][] intervals){
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        int n = intervals.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (intervals[j][1] <= intervals[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return n - Arrays.stream(dp).max().getAsInt();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);
        int[][] arr = new int[n][2];
        int[] p = new int[n];
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            String[] param = sc.nextLine().split(" ");
            arr[i][0] = Integer.parseInt(param[0]);
            arr[i][1] = Integer.parseInt(param[1]);
        }
        System.out.println((new diancai()).getAns(arr));
    }
}
