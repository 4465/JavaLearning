package com.algorithm.sort;

public class InsertionSort {

    private int[] value;

    public InsertionSort(int[] value){
        this.value = value;
    }

    //普通插入排序
    public int[] InsetSort(){

        for (int i = 1; i < value.length; i++) {
            int insertValue= value[i];
            for(int j = i-1;j>=0;j--){
                if(value[j] > insertValue){
                    int temp = value[j];
                    value[j] = insertValue;
                    value[j+1] = temp;
                }
                else {
                    break;
                }
            }
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
