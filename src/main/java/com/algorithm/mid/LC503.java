package com.algorithm.mid;

import java.util.Arrays;
import java.util.Stack;

public class LC503 {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        Arrays.fill(ans,-1);
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for(int i=0;i<len*2;i++){
            while(!s.isEmpty()&&nums[i%len]>nums[s.peek()%len]){
                ans[s.peek()%len] = nums[i%len];
                s.pop();
            }
            s.push(i%len);

        }
        return  ans;
    }
}
