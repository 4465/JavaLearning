package com.algorithm.math;

import java.util.Scanner;

public class JZ49 {
    public int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int ugly[] = new int[index+1];
//        ugly[0] = 0;
        ugly[1] = 1;
        int inde2 = 1;
        int inde3 = 1;
        int inde5 = 1;
        for (int i = 2; i <= index; i++) {
            ugly[i] = Math.min(ugly[inde2]*2, Math.min(ugly[inde3]*3, ugly[inde5]*5));
            if(ugly[i]==ugly[inde2]*2) {
                inde2++;
            }
            if(ugly[i]==ugly[inde3]*3) {
                inde3++;
            }
            if(ugly[i]==ugly[inde5]*5) {
                inde5++;
            }
        }
        return ugly[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            JZ49 jz49 = new JZ49();
            int ans = jz49.GetUglyNumber_Solution(n);
            System.out.println(ans);
        }
    }
}
