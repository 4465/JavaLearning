package com.offer;

import com.offer.math.JZ57;

import java.util.Arrays;
import java.util.Scanner;

public class TestACM1 {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);// cin是自己定义的，这个是任意的
        int test = cin.nextInt();
        while (test > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
            test--;
        }

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
            T--;
        }
    }

}
