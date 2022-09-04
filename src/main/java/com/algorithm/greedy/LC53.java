package com.algorithm.greedy;

import org.junit.jupiter.api.Test;

public class LC53 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }
}

class Solution {
    @Test
    public int maxSubArray(int[] nums) {
        int ans=0;
        int currMaxSum = Integer.MIN_VALUE;
        System.out.println(currMaxSum);
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
            currMaxSum = Math.max(ans,currMaxSum);
            System.out.println(currMaxSum);
            if(ans<0){
                ans=0;
            }
        }
        return currMaxSum;
    }
}
