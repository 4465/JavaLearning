package com.offer.math;

import java.util.Scanner;

public class JZ14 {

    public static int cutRope(int target) {
        int ans = 1;
        if(target <= 3 ){
            return target-1;
        }
        int a = target / 3;
        int b = target % 3;
        if(b==0){
            ans = (int) Math.pow(3, a);
        }
        if(b==1){
            ans = (int) (Math.pow(3,a-1)*4);
        }
        if(b==2) {
            ans = (int) (Math.pow(3, a)*2);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T,n;
        T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            n = sc.nextInt();

            int ans = JZ14.cutRope(n);
            System.out.println("答案：" + ans);
        }

    }
}
