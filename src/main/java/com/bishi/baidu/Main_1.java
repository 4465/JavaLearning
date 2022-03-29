package com.bishi.baidu;

import java.util.*;

public class Main_1 {

    Long gcd(Long a, Long b){
        return b==0 ? a: gcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main_1 main = new Main_1();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            Long m = sc.nextLong();
            int ans = 0;

            Long x= m;
            for (int j = 1; j <= Math.sqrt(m); j++) {
                if(x % j==0){
                    Long k = x/ j;
                    if(main.gcd((long) j, k) == 1)
                        ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
