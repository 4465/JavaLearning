package com.interview101;

import java.util.*;

public class BM94 {
    /**
     * max water
     * @param arr int整型一维数组 the array
     * @return long长整型
     */
    public long maxWater (int[] arr) {
        // write code here
        int len = arr.length;
        if(len <= 1){
            return 0;
        }
        int l = 0;
        int r = arr.length - 1;
        int maxL = 0;
        int maxR = 0;
        long ans = 0;
        while (l<r){
            maxL = Math.max(maxL, arr[l]);
            maxR = Math.max(maxR, arr[r]);
            if(maxL < maxR){
                ans += maxL - arr[l++];
            }else {
                ans += maxR - arr[r--];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().trim().split(" ");
        int[] arr = new int[params.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(params[i]);
        }
        BM94 bm94 = new BM94();
        long ans = bm94.maxWater(arr);
        System.out.println(ans);
    }
}
