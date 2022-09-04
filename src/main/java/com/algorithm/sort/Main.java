package com.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] input = sc.nextLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(Arrays.toString(arr));
//            InsertionSort IS = new InsertionSort(arr);
//            IS.InsetSort();
//            IS.print();

//            SelectionSort SS = new SelectionSort(arr);
//            SS.SelectSort();
//            SS.print();

//            QuicklykSort QS = new QuicklykSort(arr);
//            System.out.println(QS.toString());
//
//            QS.QuickSort(arr,0,arr.length-1);
//            System.out.println(QS.toString());
//            QS.print();

            HeapSort HS = new HeapSort();
            HS.heap_sort(arr, arr.length);
            System.out.println(Arrays.toString(arr));

        }

    }
}
