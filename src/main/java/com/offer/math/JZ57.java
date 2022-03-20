package com.offer.math;

import java.util.*;

public class JZ57 {

    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(array.length == 0)
            return arr;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            int temp = sum - array[i];
            if(set.contains(temp)){
                arr.add(temp);
                arr.add(array[i]);
                break;
            }
            else {
                set.add(array[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum;
        int T = sc.nextInt();


        while (T>0){
            String[] input = sc.nextLine().trim().split(" ");
            int[] arr = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                arr[j] = Integer.parseInt(input[j].trim());
            }
            System.out.println(Arrays.toString(arr));
            sum = sc.nextInt();
            JZ57.FindNumbersWithSum(arr, sum);
            T--;
        }
    }
}
