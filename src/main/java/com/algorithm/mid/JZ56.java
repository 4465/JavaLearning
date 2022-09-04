package com.algorithm.mid;

import java.util.*;

public class JZ56 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        Arrays.fill(ans, 0);
        for(Integer a:array){
            if(map.containsKey(a)){
                map.put(a, map.get(a) + 1);
            }
            else
                map.put(a, 1);
        }
        int cnt = 0;
        for(Integer a:map.keySet()){
            System.out.println(" "+ a + ':' + map.get(a));
            if(map.get(a) == 1){
                ans[cnt] = a;
                cnt += 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        JZ56 F = new JZ56();
        F.FindNumsAppearOnce(new int[]{1,4,1,6});
    }

}
