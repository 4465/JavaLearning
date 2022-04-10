package com.interview101;

import java.util.Scanner;

public class BM99 {

    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        int[][] matrix = new int[n][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0, k = n-1; k>=0 ; i++, k--) {
                matrix[j][k] = mat[i][j];
            }
        }
        return matrix;
    }

    public int[][] rotateMatrix2(int[][] mat, int n) {
        // write code here

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp =  mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int j = 0, k = n-1;
            while (j<k){
                int temp = mat[i][j];
                mat[i][j] = mat[i][k];
                mat[i][k] = temp;
            }
        }
        return mat;
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
    }
}
