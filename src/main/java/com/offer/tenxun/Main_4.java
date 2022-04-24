package com.offer.tenxun;

import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String str = scanner.nextLine();

        char[] chars = str.toCharArray();

        int a0 = 0;
        int a1 = 0;
        int ans = Integer.MAX_VALUE;

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(chars[j]=='0'){
                    a0 += j+1;
                }
            }

            for(int j=i;j<n;j++){
                if(chars[j]=='1'){
                    a1 += j+1;
                }
            }

            if(ans>Math.abs(a0-a1)){
                ans = Math.abs(a0-a1);
            }else{
                break;
            }
            a0 = 0;
            a1 = 0;
        }
        System.out.println(ans);
    }
}
