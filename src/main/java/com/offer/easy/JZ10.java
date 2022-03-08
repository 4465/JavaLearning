package com.offer.easy;

public class JZ10   {
    public int Fibonacci(int n) {
        if(n==1 || n==2){
            return 1;
        }
        int[] fi = new int[n+1];
        fi[1] = 1;
        fi[2] = 1;
        for(int i=3;i<=n;i++){
            fi[i] = fi[i-1] + fi[i-2];
        }
        return fi[n];
    }
}
