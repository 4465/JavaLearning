package com.basicExersice.bit;

import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i< 32;i++){
            if((n>>>i&1) == 1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
