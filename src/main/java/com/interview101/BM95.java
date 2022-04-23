package com.interview101;

import java.util.*;

public class BM95 {
    /**
     * pick candy
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int candy (int[] arr) {
        // write code here
        int len = arr.length;
        if(len<=0){
            return 0;
        }
        int[] ans = new int[len];
        Arrays.fill(ans, 1);
        for (int i = 1; i < len; i++) {
            if(arr[i] > arr[i-1]){
                ans[i] = ans[i-1] + 1;
            }
        }
        for(int i = len-2; i >= 0; i--){
            if(arr[i] > arr[i+1]){
                if(ans[i] <= ans[i+1]){
                    ans[i] = ans[i+1] + 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            System.out.print(ans[i] + " ");
            res += ans[i];
        }
        System.out.println();
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().trim().split(" ");
        int n = params.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(params[i]);
        }
        BM95 bm95 = new BM95();
        int ans = bm95.candy(arr);
        System.out.println(ans);
    }
}
