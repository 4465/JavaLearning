package com.company.alibaba;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2 {

    public int solution(int[][] arr, int[] la, int[] lb){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0){
                    if(la[i]>0){
                        ans ++;
                    }
                    if(lb[j]>0){
                        ans ++;
                    }
                }
            }
        }
        System.out.println(ans);
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[] la = new int[n];
        int[] lb = new int[m];

        arr = new int[][]{{0, 1, 0, 0}, {1, 0, 1, 0}};
        boolean flag_row = false;
        boolean flag_col = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 1){
                    flag_row = true;
                }
                if(arr[i][j]==1){
                    la[i] = 1;
                    lb[j] = 1;
                }
            }
        }
        System.out.println(Arrays.toString(la));
        System.out.println(Arrays.toString(lb));
        Main_2 main = new Main_2();
        main.solution(arr, la, lb);
    }
}
