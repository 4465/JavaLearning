package com.algorithm;

public class JZ66 {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        B[0] = 1;
        for(int i=1;i<len;i++){
            B[i] = B[i-1] * A[i-1];
        }
        int temp = 1;
        for(int i=len-2;i>=0;i--){
            temp *= A[i + 1];
            B[i] *= temp;
        }
        return B;
    }

}
