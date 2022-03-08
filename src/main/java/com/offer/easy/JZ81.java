package com.offer;

public class JZ81 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] reOrderArrayTwo (int[] array) {
        // write code here
        int length = array.length;
        int left = 0;
        int right = length - 1;
        while(left < right){
            if(array[right]%2==1 && array[left]%2==0){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            else if(array[right]%2==1 && array[left]%2==1){
                left += 1;
            }
            else if(array[right]%2==0){
                right -= 1;
            }
        }
        return array;
    }
}
