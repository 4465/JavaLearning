package com.interview101;

import java.util.*;

public class BM54 {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int len = num.length;
        Arrays.sort(num);
        for (int i = 0; i < len; i++) {
            int target = -num[i];
            int l = i + 1;
            int r = len - 1;
            while (l<r){
                if(num[l] + num[r] == target){
                    ArrayList<Integer> ans = new ArrayList<>();
                    ans.add(num[i]);
                    ans.add(num[l]);
                    ans.add(num[r]);
                    res.add(ans);
                    l++;
                }
                else if(num[l] + num[r] > target){
                    r--;
                }
                else {
                    l++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] params = sc.nextLine().trim().split(" ");
            int[] arr = new int[params.length];
            for (int i = 0; i < params.length; i++) {
                arr[i] = Integer.parseInt(params[i]);
            }
            System.out.println(new BM54().threeSum(arr));
        }
    }

}
