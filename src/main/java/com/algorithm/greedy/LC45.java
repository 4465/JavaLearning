package com.algorithm.greedy;

public class LC45 {

}


class Solution_45 {
    public int jump(int[] nums) {
        int len=nums.length;
        int cover=0;
        int ans=0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(cover,i+nums[i]);
        }
        return 0;
    }
}
