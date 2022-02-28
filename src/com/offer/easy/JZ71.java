package com.offer.easy;

public class JZ71 {
    public int jumpFloorII(int target) {
        int[] ans = new int[20];
        ans[1] = 1;
        ans[2] = 2;
        int temp = ans[1];
        for(int i=3;i<21;i++){
            temp += ans[i-1];
            ans[i] = temp + 1;
        }
        return ans[target];
    }
}
