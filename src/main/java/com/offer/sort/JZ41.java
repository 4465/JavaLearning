package com.offer.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class JZ41 {
    private ArrayList<Integer> arr = new ArrayList<>();

    public void Insert(Integer num) {
        arr.add(num);
    }

    public Double GetMedian() {
        Collections.sort(arr);
        int len = arr.size();
        if(len%2==0){
            return ( arr.get(len/2) + arr.get(len/2 - 1) ) / 2.0;
        }
        else {
            return 1.0 * arr.get(len / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

    }
}


