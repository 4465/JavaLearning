package com.interview101;

import java.util.Scanner;

public class BM97 {
    /**
     * 旋转数组
     * @param n int整型 数组长度
     * @param m int整型 右移距离
     * @param a int整型一维数组 给定数组
     * @return int整型一维数组
     */
    public int[] solve (int n, int m, int[] a) {
        // write code here
        int[] b = new int[n];
        for(int i = 0; i<n ;i++){
            b[(i+m) %n ] = a[i];
        }
        return b;
    }

    public int[] solve2(int n, int m, int[] a){
        m = m % n;
        reverse(a, 0, n-1);
        reverse(a,0,m-1);
        reverse(a,m,n-1);
        return a;
    }

    public void reverse(int[] nums, int l, int r){
        while (l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().trim().split(" ");
        int n = params.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(params[i]);
        }
        int m = sc.nextInt();
        BM97 bm97 = new BM97();
        bm97.solve2(n, m, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
