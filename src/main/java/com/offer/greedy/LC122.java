package com.offer.greedy;

public class LC122 {
    public static void main(String[] args) {

    }
}



class Sol {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int profit = prices[0];
        boolean flag = false;
        int hasValue = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = prices[i]-prices[i-1];
            if(profit<0){
                //买入
                if(!flag){
                    hasValue = prices[i];
                    flag = true;
                }
            }
            else if(profit>0){
                //卖出
                if(flag){
                    ans = ans + (prices[i] - hasValue);
                    flag = false;
                }

            }
        }
        return ans;
    }
}