package com.offer.greedy;

import java.util.Scanner;

public class JZ42 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if(sum<0){
                sum=0;
            }
            sum+=array[i];
            max = Math.max(max,sum);
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        JZ42 jz42 = new JZ42();
        jz42.FindGreatestSumOfSubArray(arr);
    }
}
