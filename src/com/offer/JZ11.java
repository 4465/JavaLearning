package com.offer;

import java.util.ArrayList;

public class JZ11 {
    public int minNumberInRotateArray(int [] array) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int a:array){
            arr.add(a);
        }
        int left = 0;
        int right = arr.size()-1;
        int mid = (left + right) / 2;
        int min = arr.get(mid);
        while(left <= right){
            if(min<arr.get(mid)){

            }
        }
        return 0;
    }

}
