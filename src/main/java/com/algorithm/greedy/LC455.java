package com.algorithm.greedy;

import java.util.Arrays;

public class LC455 {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        int start = s.length -1;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int index=g.length-1;index>=0;index--){
            if(start>0&& (g[index]<=start)){
                start--;
                ans++;
            }
        }
        return ans;
    }
}


