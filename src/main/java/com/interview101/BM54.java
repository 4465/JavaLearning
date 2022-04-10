package com.interview101;

import java.util.*;

public class BM54 {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length - 2; i++) {
            if(i!=0 && num[i] == num[i-1]){
                continue;
            }
            int target = -num[i];
            int l = i + 1;
            int r = num.length - 1;
            while (l < r){

                if(num[l] + num[r] == target){
                    ArrayList<Integer> res = new ArrayList<>();
                    res.add(num[i]);
                    res.add(num[l]);
                    res.add(num[r]);
                    ans.add(res);
                    while (l + 1 < r && num[l] == num[l+1]){
                        l++;
                    }
                    while (r - 1 > l && num[r] == num[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }
                else if(num[l] + num[r] < target){
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
        return ans;
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
