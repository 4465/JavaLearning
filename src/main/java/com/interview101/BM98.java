package com.interview101;

import java.util.*;

public class BM98 {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        int l = 0;
        int r = matrix[0].length -1;
        int down = 0;
        int up = matrix.length - 1;
        while (l<=r && down <= up){
            for (int i = l; i <= r; i++) {
                ans.add(matrix[down][i]);
            }
            down++;
            if(down > up){
                break;
            }
            for (int i = down; i <= up; i++) {
                ans.add(matrix[i][r]);
            }
            r--;
            if(l > r){
                break;
            }
            for (int i = r; i >= l; i--) {
                ans.add(matrix[up][i]);
            }
            up--;
            if(down > up){
                break;
            }
            for (int i = up; i >= down; i--) {
                ans.add(matrix[i][l]);
            }
            l++;
            if(l > r){
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        BM98 bm98 = new BM98();
    }
}
