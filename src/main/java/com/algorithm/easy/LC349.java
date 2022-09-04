package com.algorithm.easy;

import java.util.*;

public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null||nums1.length==0||nums2==null||nums2.length==0)
            return new int[0];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> reset = new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                reset.add(i);
            }
        }
        int[] arr = new int[reset.size()];
        int index =0;
        for(int i:reset){
            arr[index++] = i;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
