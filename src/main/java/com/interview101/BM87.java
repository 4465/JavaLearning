package com.interview101;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BM87 {
    public void merge(int A[], int m, int B[], int n) {
        int i = m - 1;
        int j = n - 1;
        if(j==-1){
            return;
        }
        if(i==-1){
            for (int tt = 0; tt < B.length; tt++) {
                A[tt] = B[tt];
            }
            return;
        }
        int k;
        for(k = m + n -1; k>=0; k--){
            if(A[i] >= B[j]){
                A[k] = A[i];
                i--;
            }else{
                A[k] = B[j];
                j--;
            }
            if(i==-1){
                for(int t = 0; t<k;t++){
                    A[t] = B[t];
                }
                break;
            }
            if(j==-1){
                break;
            }
        }
//        Arrays.toString(A);
        for (int s = 0; s < A.length; s++) {
            System.out.println(A[s]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] A = new int[m+n];
        int[] B = new int[n];
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        BM87 bm87 = new BM87();
        bm87.merge(A, m, B, n);
    }
}
