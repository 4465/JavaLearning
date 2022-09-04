package com.algorithm;

import java.util.Arrays;

public class JZ39 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 1;
        Arrays.sort(array);
        int ans = array[0];
        System.out.println(Arrays.toString(array));
        for(int i=1;i<array.length;i++){
            if(array[i]==ans){
                count += 1;
                if(count > array.length /2 ){
                    return ans;
                }
            }
            else {
                count = 1;
                ans = array[i];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        JZ39 M = new JZ39();
        int[] a = new int[]{1,2,3,4,2,2,2,2,2,2,2,9};
//        a =[1,2,3,4,2,2,2,2,2,2,2,9];
        M.MoreThanHalfNum_Solution(a);
    }
}
