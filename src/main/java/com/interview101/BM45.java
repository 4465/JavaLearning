package com.interview101;

import java.util.*;

public class BM45 {
    /**
     * 暴力求解
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= num.length - size; i++) {
            int max = num[i];
            for (int j = i; j < i + size; j++){
                if(max < num[j]){
                    max = num[j];
                }
            }
            ans.add(max);
        }
        return ans;
    }

    /**
     *
     * @param num
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows1(int [] num, int size){
        LinkedList queue = new LinkedList();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if(queue.size() == 3){

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        BM45 bm45 = new BM45();
        ArrayList<Integer> ans = bm45.maxInWindows(arr, k);
        System.out.println(ans);
    }
}
