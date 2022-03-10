package com.offer.greedy;

public class LC55 {
}

class Solution_55 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if(len==1)
            return true;
        int coverRange = 0;
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i+nums[i]);
            if(coverRange >= len-1){
                return  true;
            }
        }
        return false;
    }
}

