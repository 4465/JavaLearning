package com.offer.alibaba;

import java.util.Scanner;

public class Main_1 {

    private static int solution(int a, int b, int c, int d, int[] army){
        int ans = -1;
        int tank = a;
        int diaobaoIndex = 0;
        int loop = 1;
        while (true){

            if(loop % 2 == 1){
                a = tank;
                for (int i = 0; i < d; i++) {
                    if(a==0){
                        break;
                    }
                    if(a>army[i]){
                        army[i] = 0;
                        a = a - army[i];
                        d--;
                    }
                    else{
                        army[i] = army[i] - a;
                        a = 0;
                    }
                }
            }

            if(loop%2==0){
                tank = tank - d * c;
            }
            if(tank == 0 && d >0){
                ans = -1;
            }
            if(tank == 0 && d == 0){
                ans = loop % 2;
            }
            break;
        }


        return ans;
    }

    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int[] army = new int[d];
        for (int i = 0; i < d; i++) {
            army[d] = b;
        }
//        Main_1.solution(a,b,c,d);
    }
}
