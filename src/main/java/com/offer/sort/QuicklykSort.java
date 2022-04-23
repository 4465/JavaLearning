package com.offer.sort;


import java.util.Arrays;

public class QuicklykSort {
    private int[] value;

    @Override
    public String toString() {
        return "QuicklykSort{" +
                "value=" + Arrays.toString(value) +
                '}';
    }

    public QuicklykSort(int[] arr){
        this.value = arr;
    }

    public void QuickSort(int[] value, int l ,int r){

        if(l>=r) {
            return;
        }
        int key = value[l];
        int i = l, j = r;
        while (i<j){
            while (value[j] >= key && i<j){
                j--;
            }
            value[i] = value[j];
            while (value[i] <= key && i<j){
                i++;
            }
            value[j] = value[i];
        }
        value[i] = key;
        System.out.println(this.toString());
        QuickSort(value, l, i-1);
        QuickSort(value, i+1, r);
    }

    public void print(){
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        System.out.println("===============================");
    }
}
