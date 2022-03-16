package com.offer.alibaba;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            double ans=0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            ans += n;
            double temp = n;

            for(int i=1;i<m;i++){

                temp = Math.sqrt(temp);
//                System.out.println(temp);
//                System.out.println(ans);
                ans += temp;
            }
            System.out.printf("%.2f", ans);
            System.out.println();
        }
    }
}
