package com.interview101;


import java.util.*;

/**
 * 最小的K个数
 */
public class BM46 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(input.length == 0){
            return new ArrayList<>();
        }
        else {
            QuickSort(input, 0, input.length-1);
            for (int i = 0; i < k; i++) {
                ans.add(input[i]);
            }
        }
        return ans;
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
        BM46 bm46 = new BM46();
        bm46.GetLeastNumbers_Solution(arr, k);
    }
}
