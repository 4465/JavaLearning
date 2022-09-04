package com.company.netstat;

import java.util.Arrays;
import java.util.Scanner;

public class Main_3v3 {

    static final int INF = 100000;


    public  int floyd(int[][] dis, int n) {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    boolean cantGoThrough = i == j || dis[i][k] == INF || dis[k][j] == INF;
                    if (cantGoThrough) {
                        continue;
                    }
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
                }
            }
        }
        // 开始筛选
        int key = 0, ans = INF;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && dis[i][j] > max) {// 如果不能传播到所有人，自然会记录到一个INF，自动无视
                    max = dis[i][j];
                }
            }
            // System.out.println(max);
            if (max < ans) {// 最大值都小了，其他的不用比了，选最大值最小那个记录下来
                ans = max;
                key = i;
            }
        }
        return ans == INF ? -1 : (key + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int w = sc.nextInt();
            for (int j = 0; j < 3; j++) {
                arr[s][e] = w;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        Main_3v3 main = new Main_3v3();
        System.out.println(main.floyd(arr, n));

    }
}
