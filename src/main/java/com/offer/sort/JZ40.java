package com.offer.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JZ40 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
//        System.out.println(Arrays.toString(input));
//        System.out.println(k);
        ArrayList<Integer> ans = new ArrayList<>();
        if(k==0) {
            ans.add(null);
            return ans;
        }
        if(k>input.length){
            return null;
        }

        QuickSort(input, 0, input.length-1);
        for (int i = 0; i < k; i++) {
            ans.add(input[i]);
        }
        return ans;
    }

    public void QuickSort(int[] input, int l, int r) {
        int i = l;
        int j =r;
        if (i > j) {
            return;
        }
        int key = input[i];
        while (i < j) {
            while (input[j] >= key && i < j) {
                j--;
            }
            input[i] = input[j];
            while (input[i] <= key && i < j) {
                i++;
            }
            input[j] = input[i];
        }
        input[i] = key;
        QuickSort(input,l, i-1);
        QuickSort(input,i+1, r);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String[] input = sc.nextLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
                System.out.println(arr[i]);
            }
            int k = sc.nextInt();
//            System.out.println(k);
            JZ40 jz = new JZ40();
            ArrayList<Integer> ans = jz.GetLeastNumbers_Solution(arr, k);
        System.out.println(ans);

    }

}
