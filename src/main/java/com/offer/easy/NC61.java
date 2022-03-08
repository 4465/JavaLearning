package com.offer.easy;

import java.util.HashMap;

public class NC61 {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<numbers.length;i++){
            int temp = target - numbers[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp) + 1 , i+1};
            }else{
                map.put(numbers[i], i);
            }
        }
        return new int[]{0,0};
    }
}
