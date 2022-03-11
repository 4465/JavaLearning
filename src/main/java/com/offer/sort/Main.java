package com.offer.sort;

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
//            InsertionSort IS = new InsertionSort(arr);
//            IS.InsetSort();
//            IS.print();

            SelectionSort SS = new SelectionSort(arr);
            SS.SelectSort();
            SS.print();
        }

    }
}
