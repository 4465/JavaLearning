package com.offer.array;

import java.util.Scanner;

public class JZ51 {
    public int InversePairs(int [] array) {
        int len = array.length;
        int ans=0;

        int[] copy =  new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = array[i];
        }
        int[] temp = new int[len];
        return InversePairs(copy, 0, len-1, temp);
    }

    /**
     * array[left...rigt]计算逆序对个数并且排序
     * @param copy
     * @param left
     * @param right
     * @param temp
     * @return
     */
    private int InversePairs(int[] copy, int left, int right, int[] temp) {
        if(left==right){
            return 0;
        }
        int mid =left +  (right - left) / 2;
        int leftPairs = InversePairs(copy, left, mid, temp);
        int rightPairs = InversePairs(copy, mid+1, right, temp);

        if(copy[mid]<=copy[mid+1]){
            return leftPairs + rightPairs;
        }
        int crossPairs = mergeAndCount(copy, left, mid, right, temp);
        return leftPairs + rightPairs + crossPairs;
    }

    /**
     *
     * @param copy
     * @param left
     * @param mid
     * @param right
     * @param temp
     * @return
     */
    private int mergeAndCount(int[] copy, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = copy[i];
        }
        int i = left;
        int j = mid +1;
        int count = 0;
        for (int k = left; k <= right ; k++) {
            if(i==mid+1){
                copy[k] = temp[j];
                j++;
            }else if(j==right +1){
                copy[k] = temp[i];
                i++;
            }else if(temp[i] <= temp[j]){
                copy[k] = temp[i];
                i++;
            }else{
                copy[k] = temp[j];
                j++;
                count += (mid-i+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        JZ51 jz51 = new JZ51();
        int ans = jz51.InversePairs(arr);
        System.out.println("ans:" + ans);
    }
}
