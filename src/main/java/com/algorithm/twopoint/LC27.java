package com.algorithm.twopoint;

import java.util.*;

public class LC27 {
    public int removeElement(int[] nums, int val) {
        /**
         * 暴力求解
         */
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == val){
                for(int j = i;j<len-1;j++){
                    nums[j] = nums[j+1];
                }
                len--;
                i--;
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
        System.out.println(len);
        return len;
    }

    public int removeElement2(int[] nums, int val) {
        /**
         * 双指针方法
         */
        int len = nums.length;
        int slowIndex =0, fastIndex = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] == val){
                fastIndex ++;
            }
            else {
                nums[slowIndex] = nums[fastIndex];
                fastIndex++;
                slowIndex++;
            }

        }
        return slowIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int target = sc.nextInt();
            new LC27().removeElement(arr,target);
        }
    }
}
