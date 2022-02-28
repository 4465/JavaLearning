package com.offer.easy;

public class NC40{
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public int[] MySort (int[] arr) {
        // write code here
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=i;j--){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,2,3,1,4,0};
        NC40 ms = new NC40();
        ms.MySort(a);
        for(Integer i:a){
            System.out.println(i);
        }
    }
}