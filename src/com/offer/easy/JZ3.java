package com.offer.easy;

public class JZ3 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        // write code here
        int[] count = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            count[i] = 0;
        }
        for(int num :numbers){
            count[num] += 1;
        }
        for(int i=0;i<numbers.length;i++){
            if(count[i]>1){
                return i;
            }
        }
        return -1;
    }

}
