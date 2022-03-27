package com.interview101;

import java.util.ArrayList;
import java.util.Scanner;

public class BM47 {
    public int findKth(int[] a, int n, int K) {
        // write code here
        QuickSort(a, 0, n-1);

        return a[n-K];
    }


    public void QuickSort(int[] arr, int l, int r){
        if(l>=r){
            return;
        }
        int i = l;
        int j = r;
        int k = arr[i];
        while (i< j){
            while (arr[j] >= k && i< j){
                j--;
            }
            arr[i] = arr[j];
            while (arr[i] <= k && i < j){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = k;
        QuickSort(arr, l, i-1);
        QuickSort(arr, i+1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        BM47 bm47 = new BM47();
        System.out.println(bm47.findKth(arr, n, k));
    }
}
