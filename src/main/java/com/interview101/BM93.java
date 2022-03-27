package com.interview101;

import java.util.*;

/**
 * 盛水最多的容器
 */
public class BM93 {
    public int maxArea (int[] height) {
        // write code here
        if(height.length<2){
            return 0;
        }
        int l = 0;
        int r = height.length-1;
        int ans = 0;
        while (l < r ){
            ans = Math.max(Math.min(height[l], height[r])*(r-l), ans);
            if(height[l] < height[r]){
                l++;
            }else {
                r--;
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String[] params = sc.nextLine().trim().split(" ");
            int[] arr = new int[params.length];
            for (int i = 0; i < params.length; i++) {
                arr[i] = Integer.parseInt(params[i]);
            }
            BM93 bm93 = new BM93();
            bm93.maxArea(arr);
        }
    }
}
