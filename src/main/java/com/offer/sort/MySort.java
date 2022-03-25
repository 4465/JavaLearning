package com.offer.sort;

import java.util.Scanner;

public class MySort {

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("============================");
    }

    public static void QuickSort(int[] arr, int l, int r){

    }


    public static void InsertSort(int[] arr){
        print(arr);
        int len = arr.length;
        int key;
        for (int i = 1; i < len; i++) {
            key = arr[i];
            int j = i-1;
            for(j = i -1 ;j>=0; j--){
                if(key < arr[j]){
                    arr[j+1] = arr[j];
                }
                 else {
                    break;
                }
            }
            arr[j+1] = key;
        }
        print(arr);
    }

    public static void SelectSort(int[] arr){
        print(arr);
        if(arr.length <= 0){
            System.out.println("请输入正确的数组");
        }

        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        print(arr);
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void BubbleSort(int[] arr){
        print(arr);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = len-1; j > 0; j--) {
                if(arr[j] <= arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    public static void ShellSort(int[] arr){
        print(arr);
        int len = arr.length;
        int i, j, inc;
        for(inc = len/2; inc > 0; inc /= 2){
            //每趟进行插入排序
            for (i = inc; i<len;i++){
                int key = arr[i];
                for (j = i; j >= inc && key < arr[j - inc]; j-=inc){
                        arr[j] = arr[j-inc];
                }
                arr[j] = key;
            }
        }
        print(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        MySort.QuickSort(arr, 0, arr.length-1);
//        MySort.InsertSort(arr);
//        MySort.SelectSort(arr);
//        MySort.BubbleSort(arr);
        MySort.ShellSort(arr);
    }

}
