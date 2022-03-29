package com.interview101;

import java.util.*;
public class BM19 {

    public int findPeakElement (int[] nums) {
        // write code here
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return 0;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(i==0){
                if(nums[i] > nums[i+1]){
                    list.add(i);
                }
            }
            else if(i==n-1){
                if(nums[i] > nums[i-1]){
                    list.add(i);
                }
            }
            else if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                list.add(i);
            }
        }
//        System.out.println(list.toString());
        return list.get(0);
    }

    /**
     * 二分法
     * @param nums
     * @return
     */
    public int findPeakElement1 (int[] nums) {
        // write code here
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return 0;
        }
//        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int left = 0;
        int right = n -1;
        while (left < right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid + 1]){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return right;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] params = sc.nextLine().trim().split(" ");
            int n = params.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(params[i]);
            }
            BM19 bm19 = new BM19();
            System.out.println(bm19.findPeakElement(arr));
        }
    }
}
