package com.algorithm.mid;

import java.util.ArrayList;
import java.util.HashMap;

public class BM54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(j!=i){
                    int temp = 0 - num[i] - num[j];
                    if(!map.containsKey(temp)){
                        map.put(temp,1);
                    }
                    else {
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(num[i]);
                        arr.add(num[j]);
                        arr.add(temp);
                        ans.add(arr);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
