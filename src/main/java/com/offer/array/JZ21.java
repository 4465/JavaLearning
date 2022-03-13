package com.offer.array;

import java.util.Scanner;

public class JZ21 {
    //时间复杂度 O(n)，空间复杂度 O(n)
    public int[] reOrderArray (int[] array) {
        // write code here
        int lenA=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                lenA++;
            }
        }
        int[] ans = new int[array.length];
        int indexA = lenA;
        int indexB = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                ans[indexA++] = array[i];
            }else {
                ans[indexB++] = array[i];
            }
        }
        return ans;
     }

     //时间复杂度 O(n^2),空间复杂度 O(1)
    public int[] reOrderArray2 (int[] array) {

        return null;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        JZ21 jz21 = new JZ21();
        int[] ans = jz21.reOrderArray(arr);
    }
}
