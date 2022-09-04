package com.company.weBank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr = new int[n+1];
        sc.nextLine();
        String[] params = sc.nextLine().split(" ");
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(params[i-1]);
        }
        for (int i = 1; i < n+1; i++) {
            int min = arr[i];
            ArrayList<Integer> ans = new ArrayList<>();
            if(i-x>=1){
                for(int j = i-x;j < i; j++){
                    ans.add(arr[j]);
                }
            }else {
                for(int j = 0;j < i; j++){
                    ans.add(arr[j]);
                }
            }
            if(i+y<=n){
                for(int j = i;j <= i+y; j++){
                    ans.add(arr[j]);
                }
            }
            else {
                for(int j = i;j <= n; j++){
                    ans.add(arr[j]);
                }
            }
            Collections.sort(ans);
            if(min == ans.get(0)){
                System.out.println(i);
                break;
            }
        }
        System.out.println();
    }
}
