package com.company.weBank;

import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        String[] params = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(params[i]);
        }
        for(int i=0;i<n;i++){
            if(A(arr, i, y) && B(arr, i, x)){
                System.out.println(i+1);
                break;
            }
        }
    }

    public static boolean A(int[] arr, int i, int j){
        for(int k =1; k<=j && i+k < arr.length; k++){
            if(arr[i+k] < arr[i]) return false;
        }
        return true;
    }

    public static boolean B(int[] arr, int i, int j){
        for(int k =1; k<=j && i-k>=0; k++){
            if(arr[i-k] < arr[i]) return false;
        }
        return true;
    }
}
