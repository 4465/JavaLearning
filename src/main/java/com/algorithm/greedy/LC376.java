package com.algorithm.greedy;

public class LC376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1)
            return 1;
        if(nums.length==2 && nums[0]!=nums[1])
            return 2;
        int ans = 1;
        int a = nums[0];
        int flag = 0;//寻找更大的数
        for (int i = 1; i < nums.length; i++) {
            if(a!=nums[i]){
                if(a>nums[i]){
                    flag = 1;
                    break;
                }
                else
                {
                    flag = 0;
                    break;
                }

            }

        }

        for (int i = 0; i < nums.length-1; i++) {
            if(flag == 0 && nums[i]<nums[i+1]){
                ans++;
                flag = 1;
            }
            else if(flag==1&& nums[i]>nums[i+1]){
                ans++;
                flag=0;
            }
        }
        return ans;
    }
}
