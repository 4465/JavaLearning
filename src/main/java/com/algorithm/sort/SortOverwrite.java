package com.algorithm.sort;

import java.util.*;

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

public class SortOverwrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("======================================");
//            Arrays.sort(arr, new Comparator<Integer>(){
//                public int compare(Integer o1, Integer o2) {
//                    return o2-o1;
//                }
//            });
            Arrays.sort(arr, new MyComparator());
            System.out.println(Arrays.toString(arr));
        }
    }

}
