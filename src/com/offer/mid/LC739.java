package com.offer.mid;

import java.util.Arrays;
import java.util.Stack;

//单调栈
public class LC739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[]{};
        Arrays.fill(ans,0);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=0;i<temperatures.length;i++){
            if(temperatures[i]<=temperatures[stack.peek()]){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                    ans[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return ans;
    }
}
