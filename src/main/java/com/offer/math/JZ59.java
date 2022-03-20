package com.offer.math;


import java.util.*;

public class JZ59 {

    public static ArrayList<Integer> maxInWindows1(int [] num, int size) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(num.length == 0 || num.length<size)
            return arr;

        for (int i = 0; i <= num.length-size; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + size; j++) {
                if(num[j] > max){
                    max = num[j];
                }
            }
            arr.add(max);
        }
        System.out.println(arr);
        return arr;
    }

    public static ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(num.length == 0 || num.length<size)
            return arr;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.offer(num[i]);
        }
        arr.add(Collections.max(list));
        for(int i = size;i<num.length;i++){
            list.poll();
            list.offer(num[i]);
            arr.add(Collections.max(list));
        }
        System.out.println(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String[] input = sc.nextLine().split(" ");
            int[] arr = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                arr[j] = Integer.parseInt(input[j]);
            }
            int size = sc.nextInt();
            JZ59.maxInWindows(arr, size);
        }

    }
}
