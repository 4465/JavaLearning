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
        ArrayList<Integer> ans = new ArrayList<>();
        int n = num.length;
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            while (!deque.isEmpty() && num[i] >= num[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        ans.add(num[deque.peekFirst()]);

        for (int i = size; i < n; i++) {
            while (!deque.isEmpty() && num[i] >= num[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
            while (deque.peekFirst() <= i -size){
                deque.pollFirst();
            }
            ans.add(num[deque.peekFirst()]);
        }
        return ans;
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
        ArrayList<Integer> ans = bm45.maxInWindows1(arr, k);
        System.out.println(ans);
    }
}
