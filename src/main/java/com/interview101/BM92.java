package com.interview101;

import java.util.*;


/**
 * 最长无重复子数组
 */
public class BM92 {

    public int maxLength (int[] arr) {
        // write code here
        LinkedList<Integer> list = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int cnt = 0;
        int len = arr.length;
        if(len == 0){
            return 0;
        }
        for (int i = 0; i < len; i++) {
            if(map.containsKey(arr[i])){
                while (true){
                    if(list.peekFirst() == arr[i] && !list.isEmpty()){
                        list.pollFirst();
                        list.addLast(arr[i]);
                        break;
                    }else {
                        map.remove(list.pollFirst());
                        cnt--;
                    }
                }
            }else{
                map.put(arr[i], 1);
                list.addLast(arr[i]);
                cnt++;
                ans = Math.max(cnt, ans);
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            BM92 bm92 = new BM92();
            bm92.maxLength(arr);
        }
    }
}
