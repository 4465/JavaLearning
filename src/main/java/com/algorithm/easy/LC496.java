package com.algorithm.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int[] ans = new int[len];
        Arrays.fill(ans,-1);
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<len;i++){
            map.put(nums1[i], i);
        }
        s.push(nums2[0]);
        for(int i=1;i<nums2.length;i++){
            while(!s.isEmpty() && nums2[i]>s.peek()){
                if(map.containsKey(s.peek())){
                    ans[map.get(s.peek())] = nums2[i];
                }
                s.pop();
            }

            s.push(nums2[i]);
        }

        return ans;
    }
}
