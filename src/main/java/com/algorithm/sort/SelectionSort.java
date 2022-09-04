package com.algorithm.sort;

public class SelectionSort {
    private int[] value;

    public SelectionSort(int[] value){
        this.value = value;
    }

    public int[] SelectSort(){
        int min = Integer.MAX_VALUE;
        int index=-1;
        for (int i = 0; i < value.length; i++) {
            min = value[i];
            index = i;
            for(int j=i;j<value.length;j++){
                if(min>value[j]){
                    min = value[j];
                    index = j;
                }
            }
            int temp = value[i];
            value[i] = value[index];
            value[index] = temp;


        }
        return value;
    }

    public void print(){
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
        System.out.println("====================================");
    }
}
