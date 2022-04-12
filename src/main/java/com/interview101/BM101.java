package com.interview101;

import javax.imageio.stream.ImageInputStream;
import java.util.*;

public class BM101 {
    /**
     * lfu design
     * @param operators int整型二维数组 ops
     * @param k int整型 the k
     * @return int整型一维数组
     */


    public int[] LFU (int[][] operators, int k) {
        // write code here
        System.out.println("k:" + k);
        HashMap<Integer, Integer> map = new HashMap<>(k);

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < operators.length; i++) {
            if(operators[i][0] == 1){
                set(operators[i][1], operators[i][2], map, k);
            }
            if(operators[i][0] == 2){
                int temp = get(operators[i][1], map);
//                System.out.println(temp);
                list.add(temp);
            }
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
            System.out.println("map大小:" + map.size());
            System.out.println("=====================================");
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
//            System.out.print(ans[i] + " ");
        }
        System.out.println();
        return ans;
    }

    public int get(int key, HashMap<Integer, Integer> map){
        if(map.containsKey(key)){
            return map.get(key);
        }
        else{
            return -1;
        }
    }

    public void set(int key, int value, HashMap<Integer, Integer> map, int k) {
        if (map.size() <= k) {
            map.put(key, value);
        } else {
            int min = Integer.MAX_VALUE;
            int kk = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() < min) {
                    min = entry.getValue();
                    key = entry.getKey();
                }
            }
            map.remove(kk);
            System.out.println(kk);

            set(key, value, map, k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[][] op = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] params = sc.nextLine().split(" ");
            for (int j = 0; j < params.length; j++) {
                op[i][j] = Integer.parseInt(params[j]);
            }
        }
        BM101 bm101 = new BM101();
        bm101.LFU(op, k);
    }
}
