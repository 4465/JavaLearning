package com.offer.greedy;

public class LC122 {
    public static void main(String[] args) {

    }
}



class Sol {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
           ans += Math.max(prices[i] - prices[i-1] , 0);
        }

        return ans;
    }
}