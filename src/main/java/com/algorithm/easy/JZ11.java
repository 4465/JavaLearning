package com.algorithm.easy;

public class JZ11 {
    public int minNumberInRotateArray(int [] array) {

        int l = 0;
        int r = array.length-1;

        if(array.length == 1)
            return array[0];

        int mid = (l+r) >> 1;
        while(l<=r){
            mid = (l+r) >> 1;
            if(array[mid] > array[r]){
                l = mid + 1;
            }
            else if(array[mid] < array[r]){
                r = mid;
            }
            else{
                r--;
            }

        }
//        System.out.println(l);
        return  array[l];
    }

    public static void main(String[] args){
        int[] a = new int[]{1,0,1,1};
        System.out.println(new JZ11().minNumberInRotateArray(a));
    }
}
