package com.company.weBank;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().trim();
        int ans = 0;

        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len; j++) {
                String str = s.substring(i,j);
                BigInteger tem = new BigInteger(str);
//                System.out.println(tem);

                if(tem.mod(BigInteger.valueOf(m)) == BigInteger.ZERO){
                    ans++;
                }

            }
        }

        System.out.println(ans);
    }
}
