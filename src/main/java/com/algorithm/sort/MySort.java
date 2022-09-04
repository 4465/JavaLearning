package com.algorithm.sort;

import java.util.Scanner;

public class MySort {

    public static void QuickSort(int[] arr, int l, int r){
        if(l>=r)
            return;

        int key = arr[l];
        int i = l;
        int j = r;
        while (i<j){
            while (arr[j] > key && i < j){
                j--;
            }
            arr[i] = arr[j];
            while (arr[i] < key && i<j){
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = key;
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
        MySort.QuickSort(arr, 0, arr.length-1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
