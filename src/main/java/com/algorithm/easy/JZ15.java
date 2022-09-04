package com.algorithm;

public class JZ15 {
    public int NumberOf1(int n) {
        int ans = 0;
        while (n!=0){
            if((n&1) == 1)
                ans ++;
            n = n >>> 1;


        }
        return ans;
    }

    public static void main(String[] args){
        JZ15 N  = new JZ15();

        int a = N.NumberOf1(-1);
        System.out.println("a:" + a);

    }

}
